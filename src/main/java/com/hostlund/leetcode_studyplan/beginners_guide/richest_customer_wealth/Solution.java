package com.hostlund.leetcode_studyplan.beginners_guide.richest_customer_wealth;

public class Solution {
  public int maximumWealth(int[][] accounts) {
    int maximumWealth = 0;
    for(int[] account : accounts) {
      int sum = 0;
      for(int amount : account) {
        sum += amount;
      }
      maximumWealth = Math.max(maximumWealth, sum);
    }
    return maximumWealth;
  }

}
