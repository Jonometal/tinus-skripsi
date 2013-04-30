/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author overdozees
 */
public class Vertex {

    String node;
    int memo;
    Vertex from;

    public Vertex(String node) {
        this.node = node;
        this.memo = 10000;
    }
}
