package DSA.third_trimester.trees;

import java.util.ArrayList;
import java.util.Queue;

public class LevelOrderTraversal
{
    public static void main(String[] args) {
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

        levelOrder(root);
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new java.util.LinkedList<>();
        ArrayList<ArrayList<Integer>> leftView = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                level.add(current.data);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            leftView.add(level);
        }

        for (int i = 0; i < leftView.size(); i++) {
            for (int j = 0; j < leftView.get(i).size(); j++) {
                System.out.print(leftView.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
