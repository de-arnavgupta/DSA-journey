package DSA.third_trimester;

import java.util.HashMap;

class Node
{
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value)
    {
        this.key = key;
        this.value = value;
        prev = null;
        next = null;
    }
}

public class LruCache
{
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity;

    LruCache (int capacity)
    {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    void put(int key, int value)
    {
        if(map.containsKey(key))
        {
            Node oldNode = map.get(key);
            deleteNode(oldNode);
            map.remove(key);
        }

        if(map.size() == capacity)
        {
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node newNode = new Node(key, value);
        map.put(key, newNode);
        addNode(newNode);
    }

    void deleteNode(Node oldNode)
    {
        Node oldPrev = oldNode.prev;
        Node oldNext = oldNode.next;
        oldPrev.next = oldNext;
        oldNext.prev = oldPrev;
    }

    void addNode(Node newNode)
    {
        Node oldNext = head.next;
        head.next = newNode;
        oldNext.prev = newNode;
        newNode.next = oldNext;
        newNode.prev = head;
    }

    int get(int key)
    {
        if(!map.containsKey(key))
        {
            return -1;
        }
        Node ansNode = map.get(key);
        int ans = ansNode.value;

        map.remove(key);
        deleteNode(ansNode);
        addNode(ansNode);
        map.put(key, ansNode);

        return ans;
    }
}
