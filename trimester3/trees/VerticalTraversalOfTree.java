package DSA.trimester3.trees;

public class VerticalTraversalOfTree
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        verticalTraversal(root);
    }

    /*
     * The function to perform vertical traversal of a binary tree.
     * It uses a map to store the nodes at each horizontal distance.
     *
     * Tree is:
     *              1
     *            /   \
     *           2     3
     *          / \   / \
     *         4   5 6   7
     */

    public static void verticalTraversal(Node root) {
        if (root == null) {
            return;
        }

        // Create a map to store the nodes at each horizontal distance
        java.util.Map<Integer, java.util.List<Integer>> map = new java.util.TreeMap<>();
        verticalTraversalUtil(root, 0, 0, map);

        // Print the nodes in vertical order
        for (java.util.List<Integer> list : map.values()) {
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void verticalTraversalUtil(Node root, int horizontalDistance, int level, java.util.Map<Integer, java.util.List<Integer>> map) {
        if (root == null) {
            return;
        }

        // Add the node to the map
        map.computeIfAbsent(horizontalDistance, k -> new java.util.ArrayList<>()).add(root.data);

        // Traverse left and right subtrees
        verticalTraversalUtil(root.left, horizontalDistance - 1, level + 1, map);
        verticalTraversalUtil(root.right, horizontalDistance + 1, level + 1, map);
    }
}
