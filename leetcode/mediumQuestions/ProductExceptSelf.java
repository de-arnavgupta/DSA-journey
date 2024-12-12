package DSA.leetcode.mediumQuestions;

class ProductExceptSelf {
    public static void main(String[] args) {
        int ans[] = productExceptSelf(new int[]{1, 2, 3, 4});
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int[] ans = new int[nums.length];

        prefixProduct[0] = nums[0];
        suffixProduct[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * nums[i];
        }
        ans[0] = suffixProduct[1];
        ans[nums.length - 1] = prefixProduct[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            ans[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
        }
        return ans;
    }
}