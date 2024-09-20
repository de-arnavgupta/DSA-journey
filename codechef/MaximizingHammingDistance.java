package DSA.codechef;

import java.util.*;

public class MaximizingHammingDistance {

    public static int maximizingHammingDistance(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int result = 0;

        for (int i = 0; i < a.length(); i++) {

            if (aChars[i] == '?' && bChars[i] == '?')
            {
                aChars[i] = '0';
                bChars[i] = '1';
                result++;
            }
            else if (aChars[i] == '?' && bChars[i] == '1')
            {
                aChars[i] = '0';
                result++;
            }
            else if (aChars[i] == '1' && bChars[i] == '?')
            {
                bChars[i] = '0';
                result++;
            }
            else if (aChars[i] == '0' && bChars[i] == '?') {
                bChars[i] = '1';
                result++;

            } else if (aChars[i] == '?' &&  bChars[i] == '0') {
                aChars[i] = '1';
                result++;
            } else if (aChars[i] != bChars[i]) {
                result++;
            }
        }
        return result;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                int N = sc.nextInt();
                int M = sc.nextInt();
                int result = 0;
                String[] arr = new String[M];

                if(M == 2) {
                    for (int j = 0; j < M; j++) {
                        arr[j] = sc.next();
                    }
                    for (int j = 0; j < M; j++) {
                        for (int k = j + 1; k < M; k++) {
                            result += maximizingHammingDistance(arr[j], arr[k]);
                        }
                    }
                    System.out.println(result);
                }
                else{
                    for (int j = 0; j < M; j++) {
                        arr[j] = sc.next();
                    }
                    for (int j = 0; j < M; j++) {
                        for (int k = j + 1; k < M; k++) {
                            result += maximizingHammingDistance(arr[j], arr[k]);
                        }
                    }
                    System.out.println(result);
                }
            }
        }
    }
