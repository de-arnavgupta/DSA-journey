package DSA.trimester3.trees;

import java.util.ArrayList;

public class LeftViewOfTree
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

        leftView(root);
    }

    /*
     * Function to print the left view of the binary tree.
     * The left view of a binary tree is the set of nodes visible when the tree is
     * viewed from the left side.
     *
     *             1
     *            / \
     *           2   3
     *          / \   \
     *         4   5   6
     *            / \   \
     *           7   8   9
     *                  \
     *                   10
     *
     * The left view of the above tree is 1, 2, 4, 7, 10.
     *
     * @param root The root node of the binary tree.
     *
     *
     * Let's have a queue and add the root node to it.
     * Than let's have an arraylist that has the left of the front of the queue if it's null we store the left of second, and so on
     */

    public static void leftView(Node root)
    {
        if (root == null)
        {
            return;
        }

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        ArrayList<ArrayList<Integer>> leftView = new ArrayList<>();
        queue.add(root);
        // return the list of left most node of every level

        while (!queue.isEmpty())
        {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++)
            {
                Node current = queue.poll();
                level.add(current.data);

                if (current.left != null)
                {
                    queue.add(current.left);
                }
                if (current.right != null)
                {
                    queue.add(current.right);
                }
            }
            leftView.add(level);
        }

        for (int i = 0; i < leftView.size(); i++)
        {
            System.out.print(leftView.get(i).get(0) + " ");
        }
    }
}
