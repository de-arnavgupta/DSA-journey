package DSA.second_trimester.hashMap;

public class EquilibriumIndexOfAnArray
{
    public static void main(String[] args)
    {

    }
    public static int Solution(int[] arr)
    {
       int sum = 0;
       for(int i = 0; i < arr.length; i++)
       {
           sum += arr[i];
       }
       int leftSum = 0;
       for(int i = 0; i < arr.length; i++)
       {
           sum -= arr[i];
           if(leftSum == sum)
           {
               return i;
           }
           leftSum += arr[i];
       }
       return -1;
    }
}
