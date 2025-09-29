package com.hostlund.leetcode_studyplan.leetcode_75.sliding_window;

import java.util.Arrays;

public class Solution {

  // TODO
  // Largest contiguous value of subArray of k length
  public double findMaxAverage(int[] nums, int k) {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < nums.length - k; i++) {
      if(i == 0) {
        int sum = 0;
        for(int j = i; j < i + k -1; j++) {
          sum += nums[j];
        }
        max = sum;
      }
      else {
        int sum = max - nums[i - 1] + nums[i + k - 1];
        max = Math.max(max, sum);
      }
    }
    return 0;
  }


}
