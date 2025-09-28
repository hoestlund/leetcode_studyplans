package com.hostlund.leetcode_studyplan.leetcode_75.array_string.can_place_flowers;

class Solution {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int placesForFlowers = 0;

    if (n == 0) {
      return true;
    }

    if (flowerbed.length == 1) {
      return flowerbed[0] == 0 && n <= 1;
    }

    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0) {
        if (isFirstIndex(i)) {
          if (flowerbed[i + 1] == 0) {
            placesForFlowers++;
            flowerbed[i] = 1;
          }
        } else if (isLastIndex(flowerbed, i) && flowerbed[i - 1] == 0) {
          placesForFlowers++;
          flowerbed[i] = 1;
        } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
          placesForFlowers++;
          flowerbed[i] = 1;
        }
      }
    }
    return placesForFlowers >= n;
  }

  private boolean isFirstIndex(int i) {
    return i == 0;
  }

  private boolean isLastIndex(int[] flowerbed, int i) {
    return i == flowerbed.length - 1;
  }
}
