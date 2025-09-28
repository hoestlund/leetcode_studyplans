package com.hostlund.leetcode_studyplan.leetcode_75.array_string.reverse_words_in_string;

public class Solution {

  public String reverseWords(String s) {
    s = s.trim().replaceAll(" +", " ");
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
      sb.append(words[i]);
      if (i != 0) {
        sb.append(" ");
      }
    }
    return sb.toString();

  }

}
