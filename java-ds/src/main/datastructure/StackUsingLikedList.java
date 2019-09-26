package main.datastructure;

import static java.lang.System.exit;

public class StackUsingLikedList {

    // 類似C++之struct，建立linked list node
    private class Node {

        int data;
        Node link;// reference variable
    }

    // Globle top reference
    Node top;

    // Constructor
    public StackUsingLikedList() {
        this.top = null;
    }

    public void push(int x) {

        // create new node temp and allocate memory
        Node temp = new Node();

        // check if stack(heap) is full
        // 因為這裡不像書上範例是以傳入之參數N為SIZE，是以實際memory來當作stack之size，所以需要檢查memory使用狀況
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

    public void display() {

        if( top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while ( temp != null) {
                System.out.printf("%d->",temp.data);

                temp = temp.link;
            }
        }

    }


}
