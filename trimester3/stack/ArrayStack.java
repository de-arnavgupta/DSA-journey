package DSA.trimester3.stack;

public class ArrayStack extends Stack{
    int top;
    int size;
    int[] stack;

    public ArrayStack(int size)
    {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    public void push(int x)
    {
        try
        {
            if(top == size - 1)
            {
                throw new Exception("Stack Overflow");
            }
            stack[++top] = x;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public int pop()
    {
        try
        {
            if(top == -1)
            {
                throw new Exception("Stack Underflow");
            }
            return stack[top--];
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
    }

}
