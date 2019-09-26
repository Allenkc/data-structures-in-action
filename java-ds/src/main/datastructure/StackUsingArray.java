package main.datastructure;

import static java.lang.System.exit;

public class StackUsingArray {

    int top;

    int[] s;

    public StackUsingArray(int size) {
        top = -1;
        s = new int[size];
        System.out.printf("\n Init stack size is:" + s.length);
    }

    public void push(int element) {
        if (isFull()) {
            return;
        } else {
            top = top+1;
            s[top] = element;

        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            System.out.printf("\n Stack is empty");
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == s.length-1) {
            System.out.printf("\n Stack is full");
            return true;
        } else {
            return false;
        }
    }

    public void peek() {

        if (isEmpty()) {
            return;
        } else  {
            System.out.printf("\nTop element is:" + s[top]);
        }

    }

    public void pop(){
        if(isEmpty()){
            return;
        }
        top--;
    }

    public void display() {

        if (isEmpty()) {
            exit(1);
        } else {

            int temp = top;
            while (temp >= 0) {

                System.out.printf("\n " + s[temp]);

//                if (temp == s.length) {
//                    System.out.printf("\n Top element is:" + s[temp - 1]);
//                    System.out.printf(" and the stack is full");
//                } else {
//                    System.out.printf("\n Top element is:" + s[temp]);
//                }

                temp--;

            }

        }


    }
}
