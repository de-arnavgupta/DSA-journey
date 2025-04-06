package DSA.third_trimester.trees;

public class ComparingTwoBinaryTree
{
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        System.out.println(isSame(root1, root2));
    }

    public static boolean isSame(Node p, Node q) {
        if(p == null && q == null)
        {
            return true;
        }
        if(p == null || q == null)
        {
            return false;
        }
        if(p.data != q.data)
        {
            return false;
        }
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
