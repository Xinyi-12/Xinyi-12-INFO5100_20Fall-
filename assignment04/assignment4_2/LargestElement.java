package edu.neu.info5100.assignment04;

public class LargestElement {

    public static void main(String[] args) {


        int[] nums = {3,2,1,5,4,6};

        int[] nums02 = {3,2,3,1,2,4,5,5,6};

        LargestElement largestElement = new LargestElement();

        //test
        System.out.println(largestElement.secondMaxNum(nums,2));
        System.out.println(largestElement.secondMaxNum(nums02,4));

    }

    //int[] args is the intput array, int k is the kth largest element
    public int secondMaxNum(int[] a,int k) {

        int n = a.length;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <  n- i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                }
            }
        }
        return a[n-k];
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}

//print
//5
//4
