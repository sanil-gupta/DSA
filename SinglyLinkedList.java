import java.util.Scanner;

public class SinglyLinkedList {
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

    public void insertNodeAtBeginningOfLL() {
        int data, n;
        do {
            System.out.println("Enter data for insert node at beginning of LL");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head != null) {
                new_node.next = head;
            }
            head = new_node;
            System.out.println("Do you want to continue if yes then press : 1 ");
            n = sc.nextInt();
        } while (n == 1);

    }

    public void insertNodeAtEndOfLL() {
        int data, n;
        do {
            System.out.println("Enter data for insert node at end of LL");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_node;
            }
            System.out.println("Do you want to continue press 1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void insertNodeAtSpecificPositionOfLL(int position) {

        int data;
        System.out.println("Enter data for insert node at specific position");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            new_node.next = temp.next;
            temp.next = new_node;
        }

    }

    public void traversalOfLL() {

        if (head == null) {
            System.out.println("Linked List is Empty ");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void deleteNodeFromBeginningOfLL(){
        System.out.println("Deleted Node from Beginning of LL");
        if(head == null){
            System.out.println("Can't Delete Node as LL is Empty");
            return;
        }
         if(head.next == null){
             head = null;
         }
         else{
             head = head.next;
         }
    }

    public void deleteNodeFromEndOfLL(){
        System.out.println("Deleted Node from Beginning of LL");
        if(head.next == null){
            head = null;
        }else {
            Node slow = head;
            Node fast = slow.next;
            while(fast.next != null){
                slow = fast;
                fast = fast.next;
            }
            slow.next = null;
        }
    }
    public void deleteNodeFromSpecificPosition(int position){
        if(head == null ){
            System.out.println("Can't Delete Node as LL is empty!!");
        }else if(head.next == null){
            head = null;
        }else {
            Node slow = head;
            Node fast = head.next;
            for (int i = 1; i < position - 1; i++) {
               slow = fast;
               fast =  fast.next;
            }
            slow.next = fast.next;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertNodeAtBeginningOfLL();
        singlyLinkedList.traversalOfLL();
        System.out.println();
        singlyLinkedList.insertNodeAtEndOfLL();
        singlyLinkedList.traversalOfLL();
        singlyLinkedList.insertNodeAtSpecificPositionOfLL(2);
        singlyLinkedList.traversalOfLL();
        singlyLinkedList.deleteNodeFromBeginningOfLL();
        singlyLinkedList.traversalOfLL();
        singlyLinkedList.deleteNodeFromEndOfLL();
        singlyLinkedList.traversalOfLL();
        singlyLinkedList.deleteNodeFromSpecificPosition(2);
        singlyLinkedList.traversalOfLL();

    }
}
