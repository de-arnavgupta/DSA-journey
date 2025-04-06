package DSA.third_trimester.recurssion;

import java.util.ArrayList;

public class GrayCode
{
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> ans = grayCodeUsingRecursion(n, "");
        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
    }

    public static ArrayList<String> grayCodeUsingRecursion(int n, String ans)
    {
        if(n == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add(ans);
            return base;
        }

        ArrayList<String> recAns1 = grayCodeUsingRecursion(n - 1, "0" + ans);
        ArrayList<String> recAns2 = grayCodeUsingRecursion(n - 1, "1" + ans);

        ArrayList<String> myAns = new ArrayList<>();
        for (String s : recAns1)
        {
            myAns.add(s);
        }
        for (String s : recAns2)
        {
            myAns.add(s);
        }
        return myAns;
    }
}
