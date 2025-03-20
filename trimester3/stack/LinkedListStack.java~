package DSA.trimester3.stack;

public class LinkedListStack extends Stack
{

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    public LinkedListStack()
    {
        this.top = null;
    }

    public void push(int x)
    {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
    }

    public int pop()
    {
        if(top == null)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }

    public int peek()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty()
    {
        return top == null;
    }
}
