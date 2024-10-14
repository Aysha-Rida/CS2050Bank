package Program5.java;
import java.io.Serializable;
public class LinkedListQueue implements Serializable{
	private static final long serialVersionUID = 1L;
	private Node front, rear;
	private int size;

 private class Node implements Serializable {
     private static final long serialVersionUID = 1L;
     Customer data;
     Node next;

     Node(Customer data) {
         this.data = data;
         this.next = null;
     }
 }

 public LinkedListQueue() {
     front = rear = null;
     size = 0;
 }

 public void enqueue(Customer customer) {
     Node newNode = new Node(customer);
     if (rear == null) {
         front = rear = newNode;
     } else {
         rear.next = newNode;
         rear = newNode;
     }
     size++;
 }

 public Customer dequeue() {
     if (front == null) {
         return null;  // Queue is empty
     }
     Customer customer = front.data;
     front = front.next;
     if (front == null) {
         rear = null;  // Queue becomes empty
     }
     size--;
     return customer;
 }

 public boolean isEmpty() {
     return front == null;
 }

 public int size() {
     return size;
 }
}
