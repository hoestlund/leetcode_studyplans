package com.hostlund.leetcode_studyplan.leetcode_75.hash_maps_sets.difference_two_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = IntStream.of(nums1).boxed().collect(Collectors.toSet());
    Set<Integer> set2 = IntStream.of(nums2).boxed().collect(Collectors.toSet());

    ArrayList<Integer> firstResult = set1.stream().filter(i -> !set2.contains(i))
        .collect(Collectors.toCollection(ArrayList::new));
    ArrayList<Integer>  secondResult =
        set2.stream().filter(i -> !set1.contains(i))
            .collect(Collectors.toCollection(ArrayList::new));

    return Arrays.asList(firstResult, secondResult);
  }

}
