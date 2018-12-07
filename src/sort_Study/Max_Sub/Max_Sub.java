package sort_Study.Max_Sub;

public class Max_Sub {
    static class Result {
        public int left;
        public int right;
        public int maxSum;

        public Result(int left, int right, int maxSum) {
            this.left = left;
            this.right = right;
            this.maxSum = maxSum;
        }
    }

    public static Result findMaxAcross(int[] arr, int mid, int left, int right,
                                       Result result) {
        int leftSum = Integer.MIN_VALUE;
        int sum1 = 0;
        for (int i = mid; i >= left; i--) {
            sum1 += arr[i];
            if (sum1 > leftSum) {
                leftSum = sum1;
                result.left = i;//确定数组边界，i代表数组的下标
            }
        }
        int rightSum = Integer.MIN_VALUE;
        int sum2 = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum2 += arr[i];
            if (sum2 > rightSum) {
                rightSum = sum2;
                result.right = i;
            }
        }
        result.maxSum = leftSum + rightSum;
        return result;
    }

    public static Result findMaxSumArray(int[] arr, int left, int right,
                                         Result result) {
        if (left >= right) {
            return result;
        } else {
            int mid = (left + right) / 2;
            Result result1 = findMaxSumArray(arr, left, mid, result);
            Result result2 = findMaxSumArray(arr, mid + 1, right, result);
            Result result3 = findMaxAcross(arr, mid, left, right, result);
            if (result1.maxSum > result2.maxSum
                    && result1.maxSum > result3.maxSum) {
                return result1;
            } else if (result2.maxSum > result1.maxSum
                    && result2.maxSum > result3.maxSum) {
                return result2;
            } else {
                return result3;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[] { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12,
                -5, -22, 15, -4, 7 };
        Result result = new Result(Integer.MIN_VALUE, Integer.MIN_VALUE,
                Integer.MIN_VALUE);
        findMaxSumArray(test, 0, test.length - 1, result);
        System.out.println("result.maxSum = " + result.maxSum
                + "  result.left = " + result.left + "  result.right = "
                + result.right);
    }
}
