package Aug02nd2024;

// Problem 2134. Minimum Swaps to Group All 1's Together II
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,0,0,1};
        System.out.println(minSwaps(nums));
    }

    public static int minSwaps(int[] nums) {
        //Count the number of 1. That's the window size: k
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            k += nums[i];
        }

        // window slides from 0 to nums.length
        int sum = 0;
        int min = nums.length; //init large number
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];

            if (j >= k)
                sum -= nums[j-k];

            if( j >= k-1)
                min = Math.min(min, k - sum);
        }

        for(int i = 0; i <= k-2; i++){
            //length-k,...,length-1
            //length-k+1 - 0; length-k+2 - 1; length-k+3 - 2;
            sum = sum + nums[i] - nums[nums.length - k + i];
            min = Math.min(min, k-sum);
        }

        return min;
    }
}
