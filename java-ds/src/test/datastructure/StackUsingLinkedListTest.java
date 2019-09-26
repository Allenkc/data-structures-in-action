package test.datastructure;

import main.datastructure.StackUsingArray;
import main.datastructure.StackUsingLikedList;
import org.junit.jupiter.api.Test;

public class StackUsingLinkedListTest {

    @Test
    public void testStackUsingLinkedList(){
        StackUsingLikedList stack = new StackUsingLikedList();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        stack.display();

        System.out.printf("\nTop element is %d\n",stack.peek());

        stack.pop();
        stack.pop();

        stack.display();

        System.out.printf("\nTop element is %d",stack.peek());
    }

    @Test
    public void testStackUsingArray(){
        StackUsingArray stackUsingArray = new StackUsingArray(5);
        stackUsingArray.push(5);
        stackUsingArray.push(2);
        stackUsingArray.push(9);
        stackUsingArray.push(4);
        stackUsingArray.push(8);
        stackUsingArray.display();
        stackUsingArray.peek();
        stackUsingArray.push(1);

        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.display();
        stackUsingArray.peek();


        StackUsingArray stackUsingArray2 = new StackUsingArray(5);
        stackUsingArray2.push(11);
        stackUsingArray2.push(22);
        stackUsingArray2.push(33);
        stackUsingArray2.push(44);
        stackUsingArray2.display();
        stackUsingArray2.peek();

    }
}
