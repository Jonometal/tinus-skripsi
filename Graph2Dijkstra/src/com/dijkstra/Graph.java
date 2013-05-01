/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dijkstra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author Tinus
 */
public class Graph {

    private final int INFINITE = 1000000;
    double edge[][];
    ArrayList<String> edgeTrayek[][];
    Vertex daftarVertex[];
    int jumlah_vertex;
    int jumGraph;
    int vertSkrg;
    double mulaiSmpSkrg;
    List<Vertex> tujuan;
    JarJalTemp sPath[];

    public Graph() {
        edge = new double[112][112];
        edgeTrayek = new ArrayList[112][112];
        daftarVertex = new Vertex[112];
        jumlah_vertex = 0;
        jumGraph = 0;
        for (int i = 0; i < 112; i++) {
            for (int j = 0; j < 112; j++) {
                edge[i][j] = INFINITE;
                edgeTrayek[i][j] = null;
            }
        }
        sPath = new JarJalTemp[112];
    }

    public void insertVortex(String vortex) {
        Vertex a = new Vertex(vortex);
        daftarVertex[jumlah_vertex] = a;
        jumlah_vertex++;
    }

    public void insertEdge(String a, String b, double nilai, ArrayList<String> trayek) {
        int x = findIndex(a);
        int y = findIndex(b);
        if (x != -1 && y != -1) {
            edge[x][y] = nilai;
            edgeTrayek[x][y] = trayek;
        } else {
            System.out.println("Tidak ada");
        }
    }

    public int findIndex(String index) {
        int a = 0;
        while (a < jumlah_vertex) {
            if (index.equals(daftarVertex[a].nama)) {
                return a;
            } else {
                a++;
            }
        }
        return -1;
    }

    public int getMin() {
        double jarakTerpendek = INFINITE;
        int minIndeks = 0;
        for (int i = 1; i < jumlah_vertex; i++) {
            if (!daftarVertex[i].isInGraph && sPath[i].jarak < jarakTerpendek) {
                jarakTerpendek = sPath[i].jarak;
                minIndeks = i;
            }
        }
        return minIndeks;
    }

    public void adjust_sPath() {
        int kolom = 0;
        while (kolom < jumlah_vertex) {
            if (daftarVertex[kolom].isInGraph) {
                kolom++;
                continue;
            }
            double skrgKeFringe = edge[vertSkrg][kolom];
            double mulaiKeFringe = mulaiSmpSkrg + skrgKeFringe;
            double sPathDist = sPath[kolom].jarak;
            if (mulaiKeFringe < sPathDist) {
                sPath[kolom].from = vertSkrg;
                sPath[kolom].jarak = mulaiKeFringe;
            }
            kolom++;
        }
    }

    public Stack displayPaths(int tujuan, int awal) {
        Stack<String> paths = new Stack<String>();
        if (sPath[tujuan].jarak != INFINITE) {
            System.out.println("Jarak terpendek: " + sPath[tujuan].jarak);
            String myPath = daftarVertex[tujuan].nama;
            while (tujuan != awal) {
                paths.push(daftarVertex[tujuan].nama);
                myPath = daftarVertex[sPath[tujuan].from].nama + " -- " + myPath;
                tujuan = findIndex(daftarVertex[sPath[tujuan].from].nama);
            }
            paths.push(daftarVertex[awal].nama);
            System.out.println(myPath);
        }
        return paths;
    }

    public Stack dijkstra(String awal, String tujuan) {
        System.out.println("DIJKSTRA");
        int a = findIndex(awal);
        int b = findIndex(tujuan);
        daftarVertex[a].isInGraph = true;
        jumGraph = 1;
        for (int i = 0; i < jumlah_vertex; i++) {
            double jarakSementara = edge[a][i];
            sPath[i] = new JarJalTemp(a, jarakSementara);
        }
        while (jumGraph < jumlah_vertex) {
            int minIndeks = getMin();
            double minDist = sPath[minIndeks].jarak;
            if (minDist == INFINITE) {
                break;
            } else {
                vertSkrg = minIndeks;
                mulaiSmpSkrg = sPath[minIndeks].jarak;
            }
            daftarVertex[vertSkrg].isInGraph = true;
            jumGraph++;
            adjust_sPath();
        }
        jumGraph = 0;
        for (int i = 0; i < jumlah_vertex; i++) {
            daftarVertex[i].isInGraph = false;
        }
        return displayPaths(b, a);
    }

    public Stack floyd(String awal, String tujuan) {
        System.out.println("FLOYD");
        double[][] jarak = edge;
        int start = findIndex(awal);
        int finish = findIndex(tujuan);
        int bantu = finish;
        Stack<String> paths = new Stack<String>();

        int[][] path = new int[jumlah_vertex][jumlah_vertex];
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path.length; j++) {
                if (edge[i][j] == INFINITE) {
                    path[i][j] = -1;
                } else {
                    path[i][j] = i;
                }

            }

        }
        for (int i = 0; i < path.length; i++) {
            path[i][i] = i;

        }

        for (int i = 0; i < jarak.length; i++) {
            for (int j = 0; j < jarak.length; j++) {
                for (int k = 0; k < jarak.length; k++) {
                    if (jarak[j][i] + jarak[i][k] < jarak[j][k]) {
                        jarak[j][k] = jarak[j][i] + jarak[i][k];
                        path[j][k] = path[i][k];
                    }
                }
            }
        }

        System.out.println("Jarak Terpedek: " + jarak[start][finish]);
        String myPath = daftarVertex[finish].nama + "";
        paths.push(daftarVertex[finish].nama);
        while (path[start][finish] != start) {
            paths.push(daftarVertex[path[start][finish]].nama);
            myPath = daftarVertex[path[start][finish]].nama + " -- " + myPath;
            finish = path[start][finish];
        }
        paths.push(daftarVertex[start].nama);
        myPath = daftarVertex[start].nama + " -- " + myPath;
        System.out.println(myPath);
        return paths;
    }

    public void perpindahanBus(Stack stackJalur) {
        List<String> jalurPilihan = new ArrayList<String>();
        while (!stackJalur.isEmpty()) {
            jalurPilihan.add(stackJalur.pop().toString());
        }
        List<List> daftarTrayek = new ArrayList<List>();
        for (int i = 0; i < jalurPilihan.size(); i++) {
            if (i != 0) {
                int awal = findIndex(jalurPilihan.get(i - 1));
                int tujuan = findIndex(jalurPilihan.get(i));
                daftarTrayek.add(edgeTrayek[awal][tujuan]);
            }
        }
        List<String> bantu = daftarTrayek.get(0);
        for (int i = 1; i < daftarTrayek.size(); i++) {
            List<String> baru = new ArrayList<String>();
            for (int j = 0; j < bantu.size(); j++) {
                for (int k = 0; k < daftarTrayek.get(i).size(); k++) {
                    if (bantu.get(j).equals(daftarTrayek.get(i).get(k))) {
                        baru.add(bantu.get(j));
                    }

                }
            }
            if (baru.isEmpty()) {
                for (int j = 0; j < bantu.size(); j++) {
                    System.out.print(bantu.get(j));
                }
                System.out.print(" pindah di halte: " + jalurPilihan.get(i) + " ke trayek ");
                bantu = daftarTrayek.get(i);

            } else {
                bantu = baru;
            }
        }
        for (int i = 0; i < bantu.size(); i++) {
            System.out.println(bantu.get(i));
        }
    }
}
