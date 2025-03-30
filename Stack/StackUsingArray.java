package Stack;

import java.util.Scanner;

public class StackUsingArray {

    int[] stack = new int[10];
    int top = -1;
    Scanner sc = new Scanner(System.in);

    boolean underFlowCondition() {
        if (top == -1) {
            System.out.println("Can't Delete Element as stack is empty! ");
            return true;
        }
        return false;
    }

    boolean overFlowCondition() {
        if (top == stack.length - 1) {
            System.out.println("Can insert Element as Stack is full! ");
            return true;
        }
        return false;
    }

    void push() {
        if (overFlowCondition()) {
            System.out.println(("Can insert Element as Stack is full! "));
        } else {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            top = top + 1;
            stack[top] = data;
            System.out.println("Item inserted");

        }
    }

    void pop() {
        if (underFlowCondition()) {
            System.out.println("Can insert Element as Stack is Empty");
        } else {
            top = top - 1;
            System.out.println("Item deleted");
        }
    }

    void peek() {
        if (!(underFlowCondition())) {
            System.out.println(stack[top] + " ");
            System.out.println("peek operation");
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push();
        stackUsingArray.push();
        stackUsingArray.display();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.peek();
        stackUsingArray.display();
    }
}
