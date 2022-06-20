import java.util.Arrays;

public class TwoSum {
    public static void main(String args[]) {

        int[] nums = { 0, 4, 3, 0 };
        int target = 0;

        int[] Output = sumMethod(nums, target);
        System.out.println(Arrays.toString(Output));

        // learn new way to create empty array
        // ignore this
        int[] result1 = new int[2];
        System.out.println(Arrays.toString(result1));

    }

    public static int[] sumMethod(int[] nums, int target) {

        // FIRST TRY
        // int sum = 0;
        // int[] result = { 0, 0 };
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i+1; j < nums.length; j++) {
        // sum = nums[i] + nums[j];
        // if (sum == target) {
        // result[0] = i;
        // result[1] = j;
        // }
        // }
        // if (sum == target) {
        // break;
        // }
        // }
        // return result;

        // 2ND TRY
        // int sum = 0;
        // int[] result = { 0, 0 };
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // sum = nums[i] + nums[j];
        // if (sum == target) {
        // result[0] = i;
        // result[1] = j;
        // return result;
        // }
        // }
        // }
        // return result;

        //3RD TRY
        // int sum = 0;
        // int[] result = new int[2];

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         sum = nums[i] + nums[j];
        //         if (sum == target) {
        //             result[0] = i;
        //             result[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return result;   


        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

}
