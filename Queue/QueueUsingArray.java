package Queue;

import java.util.Scanner;

public class QueueUsingArray {
    Scanner sc = new Scanner(System.in);

    int rear = -1;
    int front = -1;
    int[] queue = new int[10];

    public boolean underFlowCondition() {
        if (front == -1 && rear == -1) {
            System.out.println("Can't Delete Element as Queue is Empty !");
            return true;
        }
        return false;
    }

    public boolean overFlowCondition() {
        if (rear == queue.length - 1) {
            System.out.println("Can't insert Element as Queue is Full !");
            return true;
        }
        return false;
    }

    public void Enqueue() {
        System.out.println("Enter the value");
        int data = sc.nextInt();
        if (!overFlowCondition()) {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = rear + 1;
            }
            queue[rear] = data;
        }
    }

    public void deQueue() {
        if (!underFlowCondition()) {
            front = front + 1;
        }
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.Enqueue();
        queueUsingArray.Enqueue();
        queueUsingArray.Enqueue();
        queueUsingArray.deQueue();
        queueUsingArray.deQueue();
        queueUsingArray.display();
    }

}
