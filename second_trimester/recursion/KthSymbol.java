package DSA.second_trimester.recursion;

public class KthSymbol
{
    public static void main(String[] args) {
        int row = 4;
        int b = 2;
        System.out.println(kthSymbol(row, b));
    }

    public static int kthSymbol(int row, int b) {
        if(row == 1) {
            return 0;
        }
        int mid = (int) Math.pow(2, row - 2);
        if(b <= mid) {
            return kthSymbol(row - 1, b);
        } else {
            return 1 - kthSymbol(row - 1, b - mid);
        }
    }
}
