/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author overdozees
 */
public class Main {

    public static void main(String[] args) {
        //--- Pembuatan node mulai
        Graph graph = new Graph();
        graph.insertVortex("1");
        graph.insertVortex("2");
        graph.insertVortex("3");
        graph.insertVortex("4");
        graph.insertVortex("5");
        graph.insertVortex("6");
        graph.insertVortex("7");
        graph.insertVortex("8");
        graph.insertVortex("9");
        graph.insertVortex("10");
        //--- Pembuatan node selesai

        //--- Pembuatan edge
        graph.insertEdge("1", "2", 300);
        graph.insertEdge("1", "3", 200);
        graph.insertEdge("1", "4", 350);

        graph.insertEdge("2", "5", 320);
        graph.insertEdge("2", "6", 350);
        graph.insertEdge("2", "7", 400);

        graph.insertEdge("3", "5", 350);
        graph.insertEdge("3", "6", 280);
        graph.insertEdge("3", "7", 410);

        graph.insertEdge("4", "5", 300);
        graph.insertEdge("4", "6", 250);
        graph.insertEdge("4", "7", 200);

        graph.insertEdge("5", "8", 210);
        graph.insertEdge("5", "9", 230);

        graph.insertEdge("6", "8", 350);
        graph.insertEdge("6", "9", 380);

        graph.insertEdge("7", "8", 290);
        graph.insertEdge("7", "9", 400);

        graph.insertEdge("8", "10", 380);
        graph.insertEdge("9", "10", 280);
        //--- pembuatan edge selesai

        System.out.println("Dijkstra: ");
        graph.dijkstra(graph.arr[0], graph.arr[9]);
    }
}
