package DSA.arrayList;

public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

       for(int gap = 0; gap < arr.length; gap++) {
          for(int i = 0, j = gap; j >= 0; i++, j--) {
              System.out.print(arr[i][j] + " ");
          }
           System.out.println();
       }
       for(int gap = 1; gap < arr.length; gap++) {
           for(int i = gap, j = arr.length - 1; i < arr.length; i++, j--) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    }
}
