package DSA.third_trimester.trees;

public class HeightOfBinaryTree
{
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        root.right.left.right = new Node(9);
        root.right.right.left = new Node(10);

        System.out.println(height(root));
    }

    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
