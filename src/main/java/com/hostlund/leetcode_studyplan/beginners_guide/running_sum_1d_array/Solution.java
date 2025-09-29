package com.hostlund.leetcode_studyplan.beginners_guide.running_sum_1d_array;

public class Solution {
  public int[] runningSum(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      if(i == 0) {
        continue;
      } else {
        nums[i] += nums[i - 1];
      }
    }
    return nums;
  }

}
