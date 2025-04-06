package DSA.third_trimester;

public class KReverseLinkedList
{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        ListNode result = solution.reverseList(head, 2);
        while(result != null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

class Solution
{
    public ListNode reverseList(ListNode A, int B)
    {
        ListNode current = A;
        ListNode next = null;
        ListNode prev = null;
        int count = 0;
        while(count < B && current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null)
        {
            A.next = reverseList(next, B);
        }
        return prev;
    }
}
