/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author BENE DIKTUS EKI PRABOWO
 */
public class Queue { //seklarasi kelas Queue

    LinkList antrian; //membuat variabel antrian bertipe linklist
    int Size = 0;

    public Queue() { //konstruktor untuk mengaktifkan antrian
        antrian = new LinkList();

    }

    public boolean Enqueue(Vertex element) { //method Enqueue dengan parameter masukan element
        antrian.addLast(element); //memanggil method addLast pada linklist dengan memasukkan parameter element
        Size++; //menambah ukuran
        return true; //mengembalikan true
    }

    public Vertex Dequeue() { //method Dequeue untuk mengurangi antrian
        Size--; //mengurangi ukutan
        return antrian.removeFirst().getElement(); //mengembalikan nilai antrian yang dihapus
    }

    public int Size() { //method untuk mengembalikan size
        return Size;
    }
}
