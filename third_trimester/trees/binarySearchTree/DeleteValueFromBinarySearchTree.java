package DSA.third_trimester.trees.binarySearchTree;

public class DeleteValueFromBinarySearchTree
{
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root = delete(root, 2);
        System.out.println(SearchInBinarySearchTree.search(root, 2));
    }

    public static Node delete(Node root, int key)
    {
        if(root == null)
        {
            return null;
        }
        if(key < root.data)
        {
            root.left = delete(root.left, key);
        }
        else if(key > root.data)
        {
            root.right = delete(root.right, key);
        }
        else
        {
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    public static int minValue(Node root)
    {
        int min = root.data;
        while(root.left != null)
        {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

}