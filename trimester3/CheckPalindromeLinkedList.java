package DSA.trimester3;

public class CheckPalindromeLinkedList
{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);;
        Sol sol = new Sol();
        System.out.println(sol.lPalin(head));
    }
}


class Sol
{
    public int lPalin(ListNode A)
    {
        if(A == null || A.next == null)
        {
            return 1;
        }

        ListNode pointer = A;
        int count = 1;

        while(pointer.next != null)
        {
            pointer = pointer.next;
            count++;
        }

        ListNode fast = A.next;
        ListNode slow = A;

        while(fast.next.next != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode current = A;
        ListNode next = current.next;

        while(current != slow)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(count % 2 == 0)
        {
            while(slow.next != null)
            {
                if(slow.next.val != prev.val)
                {
                    return 0;
                }
                slow = slow.next;
                prev = prev.next;
            }
            return 1;
        }
        else
        {
            while(next.next != null)
            {
                System.out.println(next.val);
                if(next.next.val != current.val)
                {
                    return 0;
                }
                next = next.next;
                current = current.next;
            }
            return 1;
        }
    }
}

