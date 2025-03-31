package Stack;

import java.util.Scanner;

public class StackUsingLinkedList {

    Scanner sc = new Scanner(System.in);

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void push() {
        System.out.println("Enter the data");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (top != null) {
            new_node.next = top;
        }
        top = new_node;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty ");
        } else {
            top = top.next;
        }
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        System.out.println("Push Operation started ");
        stackUsingLinkedList.push();
        System.out.println("Push Operation Ended ");
        System.out.println("Push Operation started ");
        stackUsingLinkedList.push();
        System.out.println("Push Operation Ended ");
        System.out.println("Push Operation started ");
        stackUsingLinkedList.push();
        System.out.println("Push Operation Ended ");
        System.out.println("Push Operation started ");
        stackUsingLinkedList.push();
        System.out.println("Push Operation Ended ");
        System.out.println("Pop operation started");
        stackUsingLinkedList.pop();
        System.out.println("pop Operation Ended");
        System.out.println("Pop operation started");
        stackUsingLinkedList.pop();
        System.out.println("pop Operation Ended");
        stackUsingLinkedList.display();
    }
}
