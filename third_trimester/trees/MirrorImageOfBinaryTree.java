package DSA.third_trimester.trees;

public class MirrorImageOfBinaryTree
{
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);

        System.out.println(isMirrorImage(root1, root2));
    }

    public static boolean isMirrorImage(Node p, Node q)
    {
        if(p == null && q == null)
        {
            return true;
        }
        if(p == null || q == null)
        {
            return false;
        }
        return p.data == q.data && isMirrorImage(p.left, q.right) && isMirrorImage(p.right, q.left);
    }
}
