/**
Ques...----> 88

Merge Sorted Array
Easy

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]





**/



class Solution {
    public int merge(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length + nums2.length];
        int i =0;
        int j=0;
        int k = 0;
        while(i < nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                nums[k] = nums1[i];
                i++;
                k++;
            }else{
                nums[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            nums[k] = nums1[i];
            i++;
            k++;
            
        }
          while(j<nums2.length){
            nums[k] = nums2[i];
            j++;
            k++;
            
        }
        
        
        return nums;
        
    }
}
