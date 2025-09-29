package com.hostlund.leetcode_studyplan.leetcode_75.array_string.string_compression;

// TODO
public class Solution {
  public int compress(char[] chars) {
    char currentChar = '!';
    int counter = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == currentChar) {
        counter++;
      } else {
        // It's difficult to do the backtracking
        }
      }
    return chars.length;
  }

  }


