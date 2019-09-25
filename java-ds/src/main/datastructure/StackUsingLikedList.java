package main.datastructure;

public class StackUsingLikedList {

    // 類似C++之struct，建立linked list node
    private class Node {

        int data;
        Node link;// reference variable
    }

    // Globle top reference
    Node top;

    // Constructor
    StackUsingLikedList() {
        this.top = null;
    }

    public void push(int x) {

        // create new node temp and allocate memory
        Node temp = new Node();

        // check if stack(heap) is full
        // 不確定用意 TODO google一下
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // 初始化這個node的資料
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {

        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() {

        if(top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = top.link;
    }


}
