package DSA.third_trimester.recurssion;

public class CountInversion
{
    public static void main(String[] args) {
        CountInversion countInversion = new CountInversion();
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println(countInversion.mergeSort(arr, 0, arr.length - 1));
    }
    public int mergeSort(int[] arr, int left, int right)
    {
        int ans = 0;
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            ans += merge(arr, left, mid, right);
        }
//        for(int num : arr)
//        {
//            System.out.print(num + " ");
//        }
//        System.out.println();

        return ans;
    }

    public int merge(int[] arr, int left, int mid, int right)
    {
        int index = 0;
        int s2 = mid + 1;
        int[] ans = new int[arr.length];
        int count = 0;

        while(left <= mid && s2 < right)
        {
            if(arr[left] > arr[s2])
            {
                ans[index++] = arr[s2++];
                count += mid - left + 1;
            }
            else
            {
                ans[index++] = arr[left++];
            }
        }
        while(left < mid)
        {
            ans[index++] = arr[left++];
        }
        while(s2 < right)
        {
            ans[index++] = arr[s2++];
        }
        for(int i = 0; i < index; i++)
        {
            arr[i] = ans[i];
        }
        for(int num: ans)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        return count;
    }
}

/*

1 2 4 (8) 9
3 (5) 6 7  10


A[i] > A[j] and i < j

inversion - 2
 */
