/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author BENE DIKTUS EKI PRABOWO
 */
public class ListNode { //deklarasi kelas listnode

    private Vertex element; //variabel elemen bertipe treenode bersifat privat
    private ListNode next; //variabel next bertipe listnode bersifat privat
    private ListNode prev; //variabel prev bertipe listnode bersifat privat

    public ListNode() { //konstruktor kosong
    }

    public ListNode(Vertex x) { //konstruktor dengan parameter x bertipe treenode
        setElement(x);
    }

    public ListNode(Vertex element, ListNode next, ListNode prev) { //konstruktor dengan parameter element bertipe treenode next dan prev bertipe listnode
        this.element = element; //element=element
        this.next = next; //
        this.prev = prev;
    }

    public Vertex getElement() { //mendapatkan nilai element
        return element; //mengembalikan nilai element
    }

    public void setElement(Vertex element) { //method untuk mengeset element
        this.element = element;
    }

    public ListNode getNext() { //mendapatkan nilai next
        return next;
    }

    public void setNext(ListNode next) { //method untuk mengeset next
        this.next = next;
    }

    public ListNode getPrev() { //mendapatkan nilai prev
        return prev;
    }

    public void setPrev(ListNode prev) { //method untuk mengeset prev
        this.prev = prev;
    }
}
