package com.sumit;

public class Solution {
	
	/*
	 * 
	 * peak elements are the element that has its neighbors less than it.
	 * 
	 * 
	 * Constraint here is to use Algorithm that has logarithmic complexity
	 * o(logn).
	 * 
	 * So I used binary search as it has o(logn) time complexity;
	 * 
	 * As long as start is less than end, find middle element.
	 * if middle element is greater than the next element, then
	 * then we will search in left half else we will search in
	 * right half of array and keep on continue as long as start
	 * index is less than end. and then return the current 
	 * start index.
	 * 
	 *  
	 */
	public static int findPeakElement(int[] nums) 
	{
        int end = nums.length-1;
        int start =0;
        
        while(start<end)
        {
            int middle = (start+end)/2;
            
            
            if(nums[middle]>nums[middle+1])
            {
            	//end is updating to middle for left half iteration
                end = middle;
            }
            else
            {
            	// start is updating for right half iteration.
                start = middle+1;
            }
         }
        
         return start;     
    }
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,1};
		
		
		/*in this array either output 1, which is index for element 2, or output 4,
		which is index of element 3 is right */
		int[] nums2 = {1,2,1,1,3,2};
		
		int[] nums3 = {1,2,1};
		
		System.out.println(Solution.findPeakElement(nums1));
		
		System.out.println(Solution.findPeakElement(nums2));
		
		System.out.println(Solution.findPeakElement(nums3));
		
		
	}

}
