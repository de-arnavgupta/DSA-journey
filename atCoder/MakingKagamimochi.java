package DSA.atCoder;

import java.util.Scanner;

public class MakingKagamimochi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] mochi = new int[N];

        for(int i = 0; i < N; i++)
        {
            int A = sc.nextInt();
            mochi[i] = A;
        }

        long count = 0;
        int j = 0;

        for (int i = 0; i < N; i++)
        {
            while (j < N && mochi[i] * 2 > mochi[j])
            {
                j++;
            }
            count += (N - j);
        }
        System.out.println(count);
    }
}