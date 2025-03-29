import java.util.Scanner;

public class DoublyLinkedList {

    Scanner sc = new Scanner(System.in);

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertNodeAtBeginningOfDoublyLL() {

        int userChoice;
        do {
            System.out.println("Enter the data ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null && tail == null) {
                head = new_node;
                tail = new_node;
            } else {
                new_node.next = head;
                head.prev = new_node;
                head = new_node;
            }
            System.out.println("Do you want to add more Node in Beginning of DoublyLL if yes Press 1 : else press 2 for exit ");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void insertNodeAtEndOfDoublyLL() {
        int userChoice;
        do {
            System.out.println("Enter the data ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null && tail == null) {
                head = new_node;
                tail = new_node;
            } else {
                tail.next = new_node;
                new_node.prev = tail;
                tail = tail.next;
            }
            System.out.println("Do you want to add more Node in End of DoublyLL if yes Press 1 : else press 2 for exit ");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void insertNodeAtSpecificPositionOfDoublyLL(int position) {
        int userChoice;
        do {
            System.out.println("Enter the data ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null && tail == null) {
                head = new_node;
                tail = new_node;
            } else {
                Node slow = head;
                Node fast = head.next;
                for (int i = 1; i < position - 1; i++) {
                    slow = fast;
                    fast = fast.next;
                }
                new_node.next = fast;
                fast.prev = new_node;
                slow.next = new_node;
                new_node.prev = slow;
            }
            System.out.println("Do you want to add more Node in End of DoublyLL if yes Press 1 : else press 2 for exit ");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void deleteBeginningNodeOfDoublyLL() {
        int userChoice;
        do {
            head = head.next;
            head.prev = null;
            System.out.println("Do you want to delete more Node in Beginning of DoublyLL if yes Press 1 : else press 2 for exit ");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void deleteEndNodeOfDoublyLL() {
        int userChoice;
        do {
            tail = tail.prev;
            tail.next = null;
            System.out.println("Do you want to delete more Node in End of DoublyLL if yes Press 1 : else press 2 for exit ");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void deleteSpecificNodeOfDoublyLL(int position) {
        int userChoice;
        do {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node slow = head;
                Node fast = head.next;
                for (int i = 1; i < position - 1; i++) {
                    slow = fast;
                    fast = fast.next;
                }
                slow.next = fast.next;
                fast = fast.next;
                fast.prev = slow;
            }
            System.out.println("Do you want to delete more specific Node of DoublyLL if yes Press 1 : else press 2 for exit ");
            userChoice = sc.nextInt();
            System.out.println("Remaining Node are : ");
            traversalOfDoublyLLFromHeadToTail();
        }while (userChoice == 1);
    }

    public void traversalOfDoublyLLFromHeadToTail() {
        if (head == null && tail == null) {
            System.out.println("LinkedList is Empty!");
            return;
        } else {
            Node temp = head;
            while (temp != tail) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public void traversalOfDoublyLLFromTailToHead() {
        if (head == null && tail == null) {
            System.out.println("LinkedList is Empty!");
            return;
        } else {
            Node temp = tail;
            while (temp != head) {
                System.out.print(temp.data + " -> ");
                temp = temp.prev;
            }
            System.out.println(temp.data);
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("Insertion in Beginning of DoublyLL is Started ");
        doublyLinkedList.insertNodeAtBeginningOfDoublyLL();
        System.out.println("Traversal from Head to Tail Started ");
        doublyLinkedList.traversalOfDoublyLLFromHeadToTail();
        System.out.println("Traversal from Tail to Head Started ");
        doublyLinkedList.traversalOfDoublyLLFromTailToHead();
        System.out.println("Insertion in End of DoublyLL is Started");
        doublyLinkedList.insertNodeAtEndOfDoublyLL();
        doublyLinkedList.traversalOfDoublyLLFromHeadToTail();
        System.out.println("Insertion of Node in Specific position of DoublyLL Started ");
        doublyLinkedList.insertNodeAtSpecificPositionOfDoublyLL(2);
        doublyLinkedList.traversalOfDoublyLLFromHeadToTail();
        System.out.println("Traversal from Tail to Head Started ");
        doublyLinkedList.traversalOfDoublyLLFromTailToHead();
        System.out.println("Deletion of Beginning Node started ");
        doublyLinkedList.deleteBeginningNodeOfDoublyLL();
        doublyLinkedList.traversalOfDoublyLLFromHeadToTail();
        System.out.println("Deletion of End Node started ");
        doublyLinkedList.deleteEndNodeOfDoublyLL();
        doublyLinkedList.traversalOfDoublyLLFromHeadToTail();
        System.out.println("Deletion of specific Node started");
        doublyLinkedList.deleteSpecificNodeOfDoublyLL(3);
        doublyLinkedList.traversalOfDoublyLLFromHeadToTail();
    }
}
