package DSA.trimester3.stack;

public class PopMidStack extends GetMinStack
{
    int size;

    public PopMidStack()
    {
        super();
        size = 0;
    }

    public void push(int x)
    {
        super.push(x);
        size++;
    }

    public int pop()
    {
        if(size == 0)
        {
            return -1;
        }
        size--;
        return super.pop();
    }

    public int getMid()
    {
        if(size == 0)
        {
            return -1;
        }
        if(size%2 == 0)
        {
            return super.get(size/2 - 1);
        }
        return super.get(size/2);
    }

    public int popMid()
    {
        if(size == 0)
        {
            return -1;
        }

        if(size%2 == 0)
        {
            return super.pop(size/2 - 1);
        }
        return super.pop(size/2);
    }
}
