package DSA.third_trimester.trees.binarySearchTree;

class Node
{
    public int data;
    public Node left;
    public Node right;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class SearchInBinarySearchTree
{
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println(search(root, 2));
        System.out.println(search(root, 5));
    }

    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }
        if(key < root.data)
        {
            return search(root.left, key);
        }
        return search(root.right, key);
    }
}
