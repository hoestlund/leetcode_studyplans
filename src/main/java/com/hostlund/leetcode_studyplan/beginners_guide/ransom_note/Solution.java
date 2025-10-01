package com.hostlund.leetcode_studyplan.beginners_guide.ransom_note;

import java.util.HashMap;

public class Solution {

  public boolean canConstruct(String ransomNote, String magazine) {
    if(ransomNote.length() > magazine.length()) {
      return false;
    }
    HashMap<Character, Integer> magazineMap = new HashMap<>();
    for(char c : magazine.toCharArray()) {
      magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
    }
    for(char c : ransomNote.toCharArray()) {
      if(magazineMap.containsKey(c) && magazineMap.get(c) > 0) {
        magazineMap.put(c, magazineMap.get(c) - 1);
      } else {
        return false;
      }
    }
    return true;
  }

}
