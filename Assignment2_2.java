package edu.neu.info5100.Assignment;



/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class Assignment2_2 {
/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and outprint its sum.
 *
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 */
public int maxSubArray(int[] nums) {
        //write your code here
    //int[] num = {-2,1,-3,4,-1,2,1,-5,4};
    int[] addNum = new int[nums.length - (4 -1)];
    int i ;
    for (i = 0; i < nums.length - (4 - 1); i++ ){
        int sum = 0;
        int z ;
        int allNum = 4;
        for (z = i; z < i + allNum ; z++){
            sum = sum + nums[z];
        }
        addNum[i] = sum;

    }

    int max = addNum[0];
    for(int m = 1; m< addNum.length;m++) {
        if (addNum[m]>max){
            max= addNum[m];
        }
    }
    System.out.println( "the max number is "+ max);
    return  max;
}



public static void main(String[] args) {
    //write your code here

    Assignment2_2 a = new Assignment2_2();
    int[] numa = {-2,1,-3,4,-1,2,1,-5,4};
    a.maxSubArray(numa);
    }

}
