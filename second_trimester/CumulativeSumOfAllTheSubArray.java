package DSA.second_trimester;

public class CumulativeSumOfAllTheSubArray
{
    public static void main(String[] args) {
        int sum = cumulativeSumOfAllTheSubArray(new int[]{1,2,3,});
        System.out.println(sum);


    }
    public static int cumulativeSumOfAllTheSubArray(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
           sum += arr[i] *(arr.length - i)* (i + 1);
        }
        return sum;
    }
}
