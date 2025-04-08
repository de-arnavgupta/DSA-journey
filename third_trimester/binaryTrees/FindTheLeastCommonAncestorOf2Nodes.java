package DSA.third_trimester.binaryTrees;

public class FindTheLeastCommonAncestorOf2Nodes
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
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);

        int node1 = 4;
        int node2 = 11;
        System.out.println(lca(root, node1, node2).data);
    }
    public static Node lca(Node root, int n1, int n2)
    {
        if (root == null)
        {
            return null;
        }
        if (root.data == n1 || root.data == n2)
        {
            return root;
        }
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);
        if (leftLCA != null && rightLCA != null)
        {
            return root;
        }
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
}
