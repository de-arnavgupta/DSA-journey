package DSA.third_trimester.binaryTrees;

import static DSA.third_trimester.binaryTrees.BinaryTree.inorder;

public class CreateMirrorImageOfBinaryTree
{
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        mirrorImage(root);
        inorder(root);
    }

    public static void mirrorImage(Node root)
    {
        if(root == null)
        {
            return;
        }
        mirrorImage(root.left);
        mirrorImage(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
