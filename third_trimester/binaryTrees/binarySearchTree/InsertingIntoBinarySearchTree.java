package DSA.third_trimester.binaryTrees.binarySearchTree;

public class InsertingIntoBinarySearchTree
{
    public static void main(String[] args)
    {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root = insert(root, 6);
        root = insert(root, 5);
        root = insert(root, 8);
        System.out.println(SearchInBinarySearchTree.search(root, 8));
    }
    public static Node insert(Node root, int key)
    {
        if (root == null)
        {
            return new Node(key);
        }
        if (key < root.data)
        {
            root.left = insert(root.left, key);
        }
        else {
            root.right = insert(root.right, key);
        }
        return root;
    }
}
