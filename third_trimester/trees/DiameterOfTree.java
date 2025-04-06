package DSA.third_trimester.trees;

public class DiameterOfTree
{
    public static void main(String[] args) {
        Node root = new Node(11);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(9);
        root.right.left = new Node(7);
        root.right.right = new Node(21);
        root.right.right.left = new Node(18);
        root.right.right.left.left = new Node(16);

        TreeData treeData = new TreeData(0, 0);

        System.out.println(treeData.diameter(root).diameter);
    }
}

class TreeData
{
    int diameter;
    int height;

    public TreeData(int diameter, int height)
    {
        this.diameter = diameter;
        this.height = height;
    }

    public TreeData diameter(Node root)
    {
        TreeData left = diameter(root.left);
        TreeData right = diameter(root.right);
        int  diameter = Math.max(Math.max(left.diameter, right.diameter), 1 + left.height + right.height);
        int height = 1 + Math.max(left.height, right.height);
        return new TreeData(diameter, height);
    }
}