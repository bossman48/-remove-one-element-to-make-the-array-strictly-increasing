import java.util.*;


public class LeetCode {

    public static void main(String []args) {
        int[] nums={1,2,10,5,7};

        System.out.println(canBeIncreasing(nums));

        int[] nums2={2,3,1,2};

        System.out.println(canBeIncreasing(nums2));

        int[] nums3={1,1,1};

        System.out.println(canBeIncreasing(nums3));

        int[] nums4={36,604,874,425,249};

        System.out.println(canBeIncreasing(nums4));


    }

    //https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
    public static boolean canBeIncreasing(int[] nums) {
        int numSize=nums.length;
        int counter=0;
        for(int i=0;i<numSize;i++){
            int[] temp=removeTheElement(nums,i);
            for(int j=0;j<temp.length-1;j++){
                if(temp[j]>=temp[j+1]){
                    counter+=1;
                }
            }
        }

        if(counter>=numSize){
            return false;
        }
        return true;
    }

    public static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

}
