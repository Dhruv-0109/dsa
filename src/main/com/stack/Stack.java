public class Stack {

    int max = 100;
    int[] stack;
    int top = -1;

    public Stack(){
        this.stack = new int[this.max];
    }

    public void push(int data){
        if(top == max-1)
            System.out.println("Stack is full");
        else
        {
          top++;
          stack[top] = data;
        }
    
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return top;
        }
      return stack[top--];
    }
    public int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return top;
        }
      return stack[top];
    }

    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top==max-1;
    }

    public int size()
    {
        return top+1;
    }

    public void display()
    {
         if(top == -1)
            System.out.println("Stack is empty");
        else{
            for(int i=0; i<=top; i++)
                {
                    System.out.print(stack[i] + " ");
                }
            System.out.println();
        }
    }
         

}
