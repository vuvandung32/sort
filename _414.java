import java.util.Arrays;

public class _414 {
        public static void thirdMax(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                System.out.print(Arrays.toString(nums));
            } else if (n == 2) {
                System.out.print(Math.max(nums[0], nums[1]));
            } else {
                Arrays.sort(nums);
                int tem = nums[2];
                nums[2] = nums[n - 1];
                nums[n - 1]=tem;
                System.out.println(Arrays.toString(nums));

            }
        }}

