package com.hostlund.leetcode_studyplan.leetcode_75.prefix_sum.highest_altititude;

class Solution {
  public int largestAltitude(int[] gains) {
    int altitude = 0;
    int max = altitude;

    for (int gain : gains) {
      altitude += gain;
      if(altitude > max){
        max = altitude;
      }
    }
    return max;
  }
}
