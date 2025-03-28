import java.util.Scanner;

public class CircularLinkedList {

    Scanner sc = new Scanner(System.in);

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertNodeAtBeginningOfCircularLL() {
        int userChoice;
        do {
            System.out.println("Enter the data for CLL");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
            }
            System.out.println("Do you want to continue if yes press 1: else press any other number to exit ");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void insertNodeAtEndOfCircularLL() {
        int userChoice;
        do {
            System.out.println("Enter the data for CLL");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null && tail == null) {
                head = new_node;
                tail = new_node;
                tail.next = head;
            } else {
                new_node.next = head;
                tail.next = new_node;
                tail = tail.next;
            }
            System.out.println("Do you want to continue if Yes press 1 else press any number");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void insertNodeAtSpecificPositionOfCircularLL(int position) {
        int userChoice;
        do {
            System.out.println("Enter the Data");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null && tail == null) {
                head = new_node;
                tail = new_node;
                tail.next = head;
            } else {
                Node slow = head;
                Node fast = head.next;
                for (int i = 1; i < position - 1; i++) {
                    slow = fast;
                    fast = fast.next;
                }
                slow.next = new_node;
                new_node.next = fast;
            }
            System.out.println("Do you want to continue if Yes press 1 else press any number");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void deleteNodeAtBeginningOfLinkedList() {
        int userChoice;
        do {
            if (head == null && tail == null) {
                System.out.println("LinkedList is Empty! can't delete the Node");
                return;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Do you want to continue delete operation if yes press 1 else press 2 for exit");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void deleteNodeAtEndOfLinkedList() {
        int userChoice;
        do {
            if (head == null && tail == null) {
                System.out.println("LinkedList is Empty! can't delete the Node");
                return;
            } else {
                Node temp = head;
                Node ptr = temp.next;
                while (ptr.next != head) {
                    temp = ptr;
                    ptr = ptr.next;
                }
                temp.next = head;
                tail = temp;
            }
            System.out.println("Do you want to continue delete operation if yes press 1 else press 2 for exit");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }

    public void traversalOfCircularLL() {
        if (head == null && tail == null) {
            System.out.println("Circular Linked List is Empty !!");
            return;
        }
        Node temp = head;
        while (temp != tail) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        System.out.println("Insert Node at beginning Operation is started");
        circularLinkedList.insertNodeAtBeginningOfCircularLL();
        circularLinkedList.traversalOfCircularLL();
        System.out.println("\nInsert Node at at beginning Operation is ended");

        System.out.println("Insert Node at end Operation is started");
        circularLinkedList.insertNodeAtEndOfCircularLL();
        circularLinkedList.traversalOfCircularLL();
        System.out.println("\nInsert Node at end Operation is ended");

        System.out.println("Insertion Node at Specific position started");
        circularLinkedList.insertNodeAtSpecificPositionOfCircularLL(3);
        circularLinkedList.traversalOfCircularLL();
        System.out.println("\nInsertion Node at Specific position ended");

        System.out.println("Deletion Beginning Node is Started");
        circularLinkedList.deleteNodeAtBeginningOfLinkedList();
        circularLinkedList.traversalOfCircularLL();
        System.out.println("\nDeletion Beginning Node is Ended");

        System.out.println("Deletion End Node is Started");
        circularLinkedList.deleteNodeAtEndOfLinkedList();
        circularLinkedList.traversalOfCircularLL();
        System.out.println("\nDeletion End Node is Ended");

    }

}
