package DSA.third_trimester.binaryTrees;

import java.util.*;

public class VerticalTraversalOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.left.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(10);

        List<List<Integer>> result = verticalTraversal(root);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> column = result.get(i);
            for (int j = 0; j < column.size(); j++) {
                System.out.print(column.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();
        verticalTraversalUtil(root, 0, 0, map);

        for (Map.Entry<Integer, Map<Integer, List<Integer>>> entry : map.entrySet()) {
            Map<Integer, List<Integer>> levels = entry.getValue();
            List<Integer> columnList = new ArrayList<>();

            for (Map.Entry<Integer, List<Integer>> levelEntry : levels.entrySet()) {
                List<Integer> nodesAtLevel = levelEntry.getValue();

                Collections.sort(nodesAtLevel);

                columnList.addAll(nodesAtLevel);
            }
            result.add(columnList);
        }

        return result;
    }

    private static void verticalTraversalUtil(Node root, int horizontalDistance, int level,
                                              Map<Integer, Map<Integer, List<Integer>>> map) {
        if (root == null) {
            return;
        }
        map.computeIfAbsent(horizontalDistance, k -> new TreeMap<>());
        map.get(horizontalDistance).computeIfAbsent(level, k -> new ArrayList<>()).add(root.data);

        verticalTraversalUtil(root.left, horizontalDistance - 1, level + 1, map);
        verticalTraversalUtil(root.right, horizontalDistance + 1, level + 1, map);
    }
}