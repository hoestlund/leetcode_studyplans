package com.hostlund.leetcode_studyplan.leetcode_75.array_string.merge_string_alternatively;

class Solution {
  public String mergeAlternately(String word1, String word2) {
    char[] firstWord = word1.toCharArray();
    char[] secondWord = word2.toCharArray();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < Math.min(firstWord.length, secondWord.length); i++) {
      sb.append(firstWord[i]);
      sb.append(secondWord[i]);
    }

    if (firstWord.length > secondWord.length) {
      sb.append(firstWord, secondWord.length , firstWord.length - secondWord.length);
    } else if (firstWord.length < secondWord.length){
      sb.append(secondWord, firstWord.length, secondWord.length - firstWord.length);
    }

    return sb.toString();

  }
}