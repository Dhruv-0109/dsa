package com.queue;

public class CircularQueue {
    int [] queue;
    int front;
    int rear;
    int max = 100;
    int size;

    public CircularQueue()
    {
        queue = new int[this.max];
        front = 0; 
        rear = -1;
        size = 0;
    }
    public boolean isEmpty()
    {
       return size==0 ; 
    }
    public boolean isFull()
    {
       return size == max; //if size reached the max size, it is full
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
    
      
        size++;
        rear = (rear + 1) % max;
        queue[rear] = data;
        return data; // 
    }

    public int dequeue() 
    {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        size--;
        int data = queue[front];
        
        front = (front + 1) % max;
        return data;
    }
    public int size() { return size; }

    public void display()
    {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        } 
        int i = front;
        for(int count = 0; count < size; count++)
        {
            System.out.println(queue[i] + " ");
            i = (i+1) % max;
        }
        
    }

}
