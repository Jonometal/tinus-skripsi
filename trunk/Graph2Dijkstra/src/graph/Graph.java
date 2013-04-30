/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @author overdozees
 */
public class Graph {

    int edge[][];
    Vertex arr[];
    int size;

    public Graph() {
        edge = new int[10][10];
        arr = new Vertex[10];
        size = 0;

    }

    public void insertVortex(String vortex) {
        Vertex a = new Vertex(vortex);
        arr[size] = a;
        size++;
    }

    public int findIndex(String index) {
        int a = 0;
        while (a < size) {
            if (index.matches(arr[a].node)) {
                return a;
            } else {
                a++;
            }
        }
        return -1;
    }

    public int searchvrt(Vertex search) {
        for (int a = 0; a < size; a++) {
            if (search.equals(arr[a])) {
                return a;
            }
        }
        return -1;
    }

    public void insertEdge(String a, String b, int nilai) { //method untuk mengisi nilai
        int x = findIndex(a);
        int y = findIndex(b);
        if (x == -1 || y == -1) {
            System.out.println("masukan tidak ada");
        } else {
            edge[x][y] = nilai;
        }
    }

    public void dijkstra(Vertex awal, Vertex akhir) {
        int v = 0;
        while (v < size) {
            for (int a = 0; a < size; a++) {
                System.out.println("[A] " + arr[a].node);
                if (arr[a] != awal) {
                    if (v == 0) {
                        if (edge[searchvrt(awal)][a] > 0) {
                            arr[a].memo = edge[searchvrt(awal)][a];
                            arr[a].from = awal;
                        }
                    } else {
                        for (int b = 0; b < size; b++) {
                            System.out.println("[B] " + arr[b].node);
                            if (arr[b] != awal && arr[b] != arr[a]) {
                                System.out.println("memo [A]: " + arr[a].memo);
                                System.out.println("memo [B]: " + arr[b].memo);
                                if (arr[a].memo > (edge[a][b] + arr[b].memo) && edge[a][b] > 0) {
                                    arr[a].memo = edge[a][b] + arr[b].memo;
                                    arr[a].from = arr[b];
                                }
                            }
                        }
                    }
                }
            }
            v++;
        }
        System.out.println(akhir.memo);
        Vertex path = akhir;
        List<String> col = new ArrayList<String>();
        while (path != awal) {
            col.add(path.node);
            path = path.from;
        }
        col.add(awal.node);
        Collections.reverse(col);
        System.out.println(col);

        for (int i = 0; i < size; i++) {
            arr[i].memo = 10000;

        }
    }
}
//    public int search(String search) {
//        for (int a = 0; a < size; a++) {
//            if (search.equals(arr[a].node)) {
//                return a;
//            }
//        }
//        return -1;
//    }
//    public void dfs() {
//        Vertex x;
//        arr[0].visit = true;
//        System.out.print(arr[0].node + " ");
//        stck.push(arr[0]);
//        while (!stck.isEmpty()) {
//            x = (Vertex) stck.lastElement();
//            int v = getAdjUnvisitedVertex(findIndex(x.node));
//            if (v == -1) {
//                stck.pop();
//            } else {
//                arr[v].visit = true;
//                System.out.print(arr[v].node + " ");
//                stck.push(arr[v]);
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] != null) {
//                arr[j].visit = false;
//            }
//        }
//    }
//
//    public void bfs() {
//        arr[0].visit = true;
//        System.out.print(arr[0].node + " ");
//        queue.Enqueue(arr[0]);
//
//        int v2;
//        while (queue.Size != 0) {
//            Vertex v1 = (Vertex) queue.Dequeue();
//            while ((v2 = getAdjUnvisitedVertex(findIndex(v1.node))) != -1) {
//                arr[v2].visit = true;
//                System.out.print(arr[v2].node + " ");
//                queue.Enqueue(arr[v2]);
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] != null) {
//                arr[j].visit = false;
//            }
//        }
//    }
//
//    public void mst() {
//        arr[0].visit = true;
//        stck.push(0);
//        while (!stck.isEmpty()) {
//            int v = (Integer) stck.peek();
//            int vx = getAdjUnvisitedVertex(v);
//            if (vx == -1) {
//                stck.pop();
//            } else {
//                arr[vx].visit = true;
//                stck.push(vx);
//                System.out.print(arr[v].node);
//                System.out.print(arr[vx].node);
//                System.out.print(" ");
//            }
//        }
//        for (int a = 0; a < arr.length; a++) {
//            if (arr[a] != null) {
//                arr[a].visit = false;
//            }
//        }
//    }
//    public void mts(){
//        arr[0].visit=true;
//        stck.push(arr[0]);
//        int x=0;
//        while(stck.isEmpty()==false){
//            Vertex v=(Vertex) stck.peek();
//            int min=100000;
//            Vertex ve=null;
//            while((x = getAdjUnvisitedVertex(findIndex(v.node))) != -1){
//                arr[x].visit=true;
//                if(min>edge[searchvrt(v)][x]){
//                    min=edge[searchvrt(v)][x];
//
//                }
//            }
//            while((x = getAdjUnvisitedVertex(findIndex(v.node))) == -1){
//                arr[x].visit=false;
//            }
//            stck.push(ve);
//        }
//    }
//    public int valueOf(String a, String b) { //metod untuk mencari nilai dari
//        int x = findIndex(a);
//        int y = findIndex(b);
//        if (x == -1 || y == -1) {
//            System.out.println("masukan tidak ada");
//            return -1;
//        } else {
//            return edge[x][y];
//        }
//    }
//    public void link(String a) {
//        int x = findIndex(a);
//        if (x == -1) {
//            System.out.println("masukan tidak ada");
//        } else {
//            for (int b = 0; b < size; b++) {
//                if (edge[x][b] != 0) {
//                    System.out.println(a + " memiliki link ke " + arr[b].node);
//                }
//            }
//        }
//    }
//
//    public void link2() {
////        int x=findIndex(a);
//        for (int a = 0; a < size; a++) {
//            for (int b = 0; b < size; b++) {
//                if (edge[a][b] != 0) {
//                    System.out.println(arr[a].node + " ---> " + arr[b].node + " = " + edge[a][b] + " Km");
//                }
//            }
//        }
//    }
//
//    public void delete(String a) {
//        int x = findIndex(a);
//        int y = x + 1;
//        while (arr[y].node != null) {
//            arr[x] = arr[y];
//            x++;
//            y++;
//        }
//    }
//
//    public void addlist() {
//        for (int a = 0; a < size; a++) {
//            lst.add(0, arr[a]);
//            size = 0;
//            for (int b = 0; b < size; b++) {
//                if (edge[a][b] != 0) {
//                    size = size++;
//                    lst.add(size, arr[b]);
//                }
//            }
//            list.add(a, lst);
//        }
//    }
//    public int getAdjUnvisitedVertex(int v) {
//        for (int j = 0; j < arr.length; j++) {
//            if (edge[v][j] > 0 && arr[j].visit == false) {
//                return j;
//            }
//        }
//        return -1;
//    }
//
//    public void display() {
//        System.out.print(" ");
//        for (int a = 0; a < size; a++) {
//            System.out.print("\t||\t" + arr[a].node);
//        }
//        for (int a = 0; a < size; a++) {
//            System.out.println("\n==============================================================================================================");
//            System.out.print("\n" + arr[a].node + "\t||");
//            for (int b = 0; b < size; b++) {
//                System.out.print("\t" + edge[a][b] + "\t||");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public void displayList() {
//        for (int a = 0; a < list.size(); a++) {
//            System.out.print(list.get(a).toString());
//            for (int b = 0; b < lst.size(); b++) {
//                System.out.print(list.get(a));
//            }
//            System.out.println("");
//        }
//    }