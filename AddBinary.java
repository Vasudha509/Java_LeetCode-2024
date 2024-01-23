// Java program to perform addition of binary numbers.

import java.util.Scanner;

class Solution {
  public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int carry = 0;
    
    int i = a.length() - 1;
    int j = b.length() - 1;
    
    while (i >= 0 || j >= 0) {
      int sum = 0;
      
      if (i >= 0)
          sum += a.charAt(i--) - '0';
      if (j >= 0)
          sum += b.charAt(j--) - '0';
        
      result.insert(0, carry);
      carry = sum / 2;
    }
    if (carry > 0) 
        result.insert(0, carry);
    return result.toString();
  }
}

class AddBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    
    System.out.print("Enter first binary number : ");
    String num1 = sc.next();
    
    System.out.print("Enter second binary number : ");
    String num2 = sc.next();
    
    String result = s.addBinary(num1, num2);
    System.out.print("Result : "+result);
    
  }
}
