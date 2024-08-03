package Aug03rd2024;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1};
        System.out.println(threeConsecutiveOdds(arr));
    }

    public static boolean threeConsecutiveOdds(int[] arr){
        for (int i = 0; i <= arr.length - 3; i++) {
            int count = 0;
            if (arr[i]%2 != 0)
                count++;
            if (arr[i+1]%2!=0)
                count++;
            if (arr[i+2]%2!=0)
                count++;
            if (count == 3)
                return true;
            else count = 0;
        }
        return false;
    }
}
