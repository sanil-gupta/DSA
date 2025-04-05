package Queue;

import java.util.Scanner;

public class QueueUsingLinkedList {

    Scanner sc = new Scanner(System.in);

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node rear = null;
    Node front = null;

    public boolean underFlow() {
        if (rear == null && front == null) {
            System.out.println("Can't Delete Element!");
            return true;
        }
        return false;
    }

    public void enqueue() {
        System.out.println("Enter the data");
        int data = sc.nextInt();
        Node newElement = new Node(data);
        if (front == null) {
            rear = newElement;
            front = newElement;
        } else {
            rear.next = newElement;
            rear = newElement;
        }
    }

    public void dequeue() {
        if (!underFlow()) {
            front = front.next;
        } else {
            underFlow();
        }
    }

    public void display() {
        if (!underFlow()) {
            while (front != rear) {
                System.out.print(front.data + " ");
                front = front.next;
            }
            System.out.println(front.data);
        }
    }

    public static void main(String[] args) {
        System.out.println("Queue Using Linked List Started ");
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        System.out.println("Enqueue 1st Operation Started ");
        queueUsingLinkedList.enqueue();
        System.out.println("Enqueue 1st Operation Ended ");
        System.out.println("Enqueue 2nd Operation Started ");
        queueUsingLinkedList.enqueue();
        System.out.println("Enqueue 2nd Operation Ended ");
        System.out.println("Enqueue 3rd Operation Started ");
        queueUsingLinkedList.enqueue();
        System.out.println("Enqueue 3rd Operation Ended");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Dequeue Operation Started ");
        queueUsingLinkedList.dequeue();
        queueUsingLinkedList.display();
    }
}
