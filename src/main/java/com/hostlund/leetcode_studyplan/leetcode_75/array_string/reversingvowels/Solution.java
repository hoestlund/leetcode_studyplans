package com.hostlund.leetcode_studyplan.leetcode_75.array_string.reversingvowels;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {

  private final Set<Character> vowels = new HashSet<>(
      Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

  public String reverseVowels(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
      if (vowels.contains(c)) {
        stack.push(c);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (vowels.contains(c)) {
        sb.append(stack.pop());
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

}
