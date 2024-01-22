// 28. Find the Index of the First Occurrence in a String

import java.util.Scanner;

class Solution {
  public int strStr(String haystack, String needle) {
    // check for edge cases
    if (needle.isEmpty()) 
      return 0; // Empty needle is always found at index 0;
      
    int haystackLength = haystack.length();
    int needleLength = needle.length();
    
    // Iterate through the haystack
    for (int i = 0; i <= haystackLength - needleLength; i++) {
      // Check if the substring of haystack starting at index i matches the needle
      if (haystack.substring(i, i + needleLength).equals(needle)) {
        return i; // Return the index if needle is found
      }
    }
    return -1; // Return -1 if needle is not found in haystack
  }
}

class FirstOccurrence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    
    System.out.print("Enter a haystack : ");
    String input1 = sc.next();
    
    System.out.print("Enter a needle : ");
    String input2 = sc.next();
    
    int iResult = s.strStr(input1, input2);
    System.out.println("Result : "+ iResult);
  }
}
