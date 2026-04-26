package com.queue;

public class Queue {
    int [] queue;
    int front;
    int rear;
    int max = 100;
    int size;

    public Queue()
    {                       
        queue = new int[this.max];
        front = 0; 
        rear = -1;
        size = 0;
    }
    public boolean isEmpty()
    {
       return front>rear ; //rear should always be higher than front
    }
    public boolean isFull()
    {
       return rear == max-1; //if rear reached the max size, it is full
    }


    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
            return queue[front];
    }

    public int enqueue(int data) 
    {
        if (isFull()) {
            System.out.println("Queue is full");
            return -1;
        }
    
        queue[++rear] = data;
        size++;
        return data; // cleaner than queue[rear]
    }

    public int dequeue() 
    {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        size--;
        return queue[front++];
    }
    public int size() { return size; }

    public void display()
    {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        } 
        for(int i=front; i <=rear; i++)
        {
            System.out.print(queue[i]+" ");
        }
    }
}
