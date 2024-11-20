package DSA.leetcode.easyQuestions;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        Long firstMax = null;
        Long secondMax = null;
        Long thirdMax = null;

        for (Integer num : nums) {
            if (firstMax != null && num.longValue() == firstMax ||
                    secondMax != null && num.longValue() == secondMax ||
                    thirdMax != null && num.longValue() == thirdMax) {
                continue;
            }

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num.longValue();
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num.longValue();
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num.longValue();
            }
        }
        if (thirdMax == null) {
            return firstMax.intValue();
        }

        return thirdMax.intValue();
    }
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,23,2,5,4,64};
        System.out.println(thirdMax(nums));
    }
}
