package DSA.third_trimester.stack;

public class LinkedListStack implements Stack
{

    protected int get(int position)
    {
        Node temp = top;
        for(int i = 0; i < position; i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }

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

    public char peek()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
            return ' ';
        }
        return (char)top.data;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int pop(int position)
    {
        if(top == null)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        if(position == 0)
        {
            int x = top.data;
            top = top.next;
            return x;
        }
        else
        {
            Node temp = top;
            for(int i = 0; i < position - 1; i++)
            {
                temp = temp.next;
            }
            int x = temp.next.data;
            temp.next = temp.next.next;
            return x;
        }
    }
}
