package DSA.third_trimester.linkedList;

class Node
{
    int value;
    Node next;
    Node random;
}

public class DeepCopy
{
    public static void main(String[] args) {
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

        head.random = head.next.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next.next.next;

        Node newHead = deepCopy(head);
        while(head != null) {
            System.out.println(head.value + " " + head.random.value);
            head = head.next;
        }
        System.out.println();
        while(newHead != null) {
            System.out.println(newHead.value + " " + newHead.random.value);
            newHead = newHead.next;
        }
    }

    public static Node deepCopy(Node head) {
        Node temp = head;
        while(temp != null) {
            Node newNode = new Node();
            newNode.value = temp.value;
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        temp = head;
        while(temp != null) {
            temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

        temp = head;
        Node newHead = temp.next;
        Node newTemp = newHead;
        while(temp != null) {
            temp.next = newTemp.next;
            temp = temp.next;
            if(temp != null) {
                newTemp.next = temp.next;
                newTemp = newTemp.next;
            }
        }
        return newHead;
    }
}


