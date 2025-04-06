package DSA.third_trimester.stack;

public class GetMinStack extends LinkedListStack
{
    LinkedListStack minStack;

    public GetMinStack()
    {
        super();
        minStack = new LinkedListStack();
    }

    public void push(int data)
    {
        super.push(data);
        if(minStack.isEmpty() || data < minStack.peek())
        {
            minStack.push(data);
        }
    }

    public int pop()
    {
        int data = super.pop();
        if(data == minStack.peek())
        {
            minStack.pop();
        }
        return data;
    }

    public int getMin()
    {
        return minStack.peek();
    }
}
