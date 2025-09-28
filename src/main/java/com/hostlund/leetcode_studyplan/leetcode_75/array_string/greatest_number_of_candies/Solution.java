package com.hostlund.leetcode_studyplan.leetcode_75.array_string.greatest_number_of_candies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatestNumberOfCandies = Arrays.stream(candies).max().orElse(0);
    return Arrays.stream(candies).mapToObj(c -> c + extraCandies >= greatestNumberOfCandies).collect(
        Collectors.toList());
  }

}
