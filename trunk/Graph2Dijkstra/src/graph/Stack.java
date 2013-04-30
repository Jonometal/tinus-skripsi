/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Prasetya
 */
public class Stack {

    LinkList tumpukan;
    int Sise = 0;

    public Stack() {
        tumpukan = new LinkList();
    }

    public void push(Vertex data) {
        tumpukan.addFirst(data);
        Sise++;
    }

    public Vertex pop() {
        Sise--;
        return tumpukan.removeFirst().getElement();
    }

    public boolean isEmpety() {


        if (Sise == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param tumpukan the tumpukan to set
     */
    public void setTumpukan(LinkList tumpukan) {
        this.tumpukan = tumpukan;
    }

    /**
     * @param Sise the Sise to set
     */
    public void setSise(int Sise) {
        this.Sise = Sise;
    }
}
