package DSA.third_trimester.trees;

public class SearchInBinaryTree
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(search(root, 4));
        System.out.println(search(root, 6));
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
        return search(root.left, key) || search(root.right, key);
    }
}
