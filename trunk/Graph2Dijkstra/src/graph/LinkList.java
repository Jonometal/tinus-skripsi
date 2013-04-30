/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author BENE DIKTUS EKI PRABOWO
 */
public class LinkList {  //deklarasi kelas linklist

    int Size = 0;
    ListNode head; //deklarasi variabel head bertipe ListNode

    public LinkList() { // konstruktor
        head = new ListNode(); //membuat kepala pada linklist
        head.setNext(head); //membuat next head menunjuk ke head
        head.setPrev(head); //membuat prev head menunjuk ke head
    }

    public ListNode addBefore(Vertex elment, ListNode after) { //method ddBefore untuk menambahkan listnode baru dengan parameter element bretipe treenode dan after bertipe listnode
        ListNode baru = new ListNode(elment); //membuat listnode baru
        baru.setNext(after); //mengeset next dari baru menunjuk after
        baru.setPrev(after.getPrev()); //mengeset prev dari baru menunjuk prev dari after
        after.setPrev(baru); //mengeset prev dari after menunjuk baru
        baru.getPrev().setNext(baru); //mengeset next dari prev dari baru menunjuk baru
        return baru; //mengembalikan nilai baru
    }

    public void addFirst(Vertex elment) { //method addFirst untuk menambahkan listnode pertama dengan parameter element bertipe treenode
        addBefore(elment, head.getNext()); //memanggil method addBefore dengan parameter element dan head.getNext
    }

    public void addLast(Vertex elment) { //method addLast untuk menambahkan listnode terakhir dengan parameter element bertipe treenode
        addBefore(elment, head); //memanggil method addBefore dengan parameter element dan head
    }

    public ListNode removeFirst() { //method removeFirst untuk menghapus listnode pada posisi pertama
        ListNode bantu = head.getNext(); //membuat listnode bantu menunjuk head.getNext
        head.setNext(bantu.getNext()); //mengeset next dari head menunjuk next dari bantu
        bantu.getNext().setPrev(head); //mengeset prev dari next dari bantu menunjuk head
        return bantu; //mengembalikan nilai bantu
    }

    public ListNode removeLast() { //method removeLast untuk menghapus listnode pada posisi terakhir
        ListNode bantu = head.getPrev(); //membuat listnode bantu menunjuk head.getPrev
        head.setPrev(bantu.getPrev()); //mengeset prev dari head menunjuk prev dari bantu
        bantu.getPrev().setNext(head); //mengeset next dari prev dari bantu menunjuk head
        return bantu; //mengembalikan nilai bantu
    }
}
