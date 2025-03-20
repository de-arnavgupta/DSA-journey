package DSA.trimester3.linkedList;

public class CheckIfCycle
{
    public static void main(String[] args)
    {
        Node head = new Node();
        head.value = 1;
        head.next = new Node();
        head.next.value = 2;
        head.next.next = new Node();
        head.next.next.value = 3;
        head.next.next.next = new Node();
        head.next.next.next.value = 4;
        head.next.next.next.next = new Node();
        head.next.next.next.next.value = 5;
        head.next.next.next.next.next = head.next.next.next.next.next;
        System.out.println(checkCycle(head));
    }
    public static boolean checkCycle(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            if(slow == fast)
            {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
