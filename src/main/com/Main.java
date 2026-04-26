package com;

import com.stack.Stack;
import com.queue.*;

//javac com/stack/Stack.java com/queue/Queue.java com/Main.java
//java com.Main 
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        CircularQueue();

    }
    public static void CircularQueue()
    {
        CircularQueue q = new CircularQueue(3); // you will modify constructor

        System.out.println("Enqueue 10");
        q.enqueue(10);

        System.out.println("Enqueue 20");
        q.enqueue(20);

        System.out.println("Enqueue 30");
        q.enqueue(30);

        System.out.println("Queue after 3 inserts:");
        q.display();

        System.out.println("\nDequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());

        System.out.println("Queue after 2 dequeues:");
        q.display();

        System.out.println("\nEnqueue 40");
        q.enqueue(40);

        System.out.println("Enqueue 50 (this should wrap around)");
        q.enqueue(50);

        System.out.println("Final Queue:");
        q.display();

        System.out.println("\nPeek: " + q.peek());
        System.out.println("Size: " + q.size());
    }

    public static void QueueExample()
    { 
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); 
        System.out.println();   // 10 20 30

        System.out.println("Peek: " + q.peek());   // 10

        System.out.println("Dequeue: " + q.dequeue()); // 10
        System.out.println("Dequeue: " + q.dequeue()); // 20

        q.display(); 
        System.out.println();   // 30

        System.out.println("Size: " + q.size());   // 1

        q.enqueue(40);
        q.enqueue(50);

        q.display(); 
        System.out.println(); 
    }

    public static void StackExample()
    {
        Stack stack = new Stack();

        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Stack size:" + stack.size());
        System.out.println("Stack peek:" + stack.peek());
        System.out.println("Stack pop:" + stack.pop());
        System.out.println("Stack peek:" + stack.peek());
        System.out.println("Stack size:" + stack.size());
    }
}
