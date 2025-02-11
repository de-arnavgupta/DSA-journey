package DSA.dhruvBhaiya.recursion;

public class PrintAllTheSubSet
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printAllTheSubSet(arr);
    }

    public static void printAllTheSubSet(int[] arr) {
        printAllTheSubSet(arr, 0, "");
    }

    public static void printAllTheSubSet(int[] arr, int idx, String asf) {
        if (idx == arr.length) {
            System.out.println(asf);
            return;
        }
        printAllTheSubSet(arr, idx + 1, asf);
        printAllTheSubSet(arr, idx + 1, asf + arr[idx] + " ");
    }
}
