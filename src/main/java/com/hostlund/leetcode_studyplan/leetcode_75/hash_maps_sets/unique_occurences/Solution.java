package com.hostlund.leetcode_studyplan.leetcode_75.hash_maps_sets.unique_occurences;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public boolean uniqueOccurrences(int[] arr) {

    Map<Character, Integer> map = new HashMap<>();
    for(int i : arr) {
      map.put((char) i, map.getOrDefault((char) i, 0) + 1);
    }
    return map.size() == map.values().stream().distinct().count();
  }

}
