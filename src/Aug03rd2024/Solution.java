/*
package Aug03rd2024;


// Problem 1460. Make 2 arrays equal by reversing sub-arrays
public class Solution {
    public static void main(String[] args) {
        */
/*int[] arr = new int[] {1, 1, 1};
        System.out.println(threeConsecutiveOdds(arr));*//*

        int[] target = new int[] {1, 2, 3, 4};
        int[] arr = new int[] {2, 4, 1, 3};
        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        //If only have 1 or no element, ye they're equal

    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while ((j <= 0) && (arr[j] > temp)) {
                arr[j + 1] = arr[j];
            }
        }
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
*/
