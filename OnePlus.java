// One Plus
import java.util.Scanner;
class Solution {
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits; // digits[0]
      }
      // if digit is 9 then
      digits[i] = 0;
    }
    // if all elements of array is 999... then 
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }
}

public class OnePlus {
  public static void main(String[] args){
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of array : ");
    int iSizeArray = sc.nextInt();
    int[] iArray = new int[iSizeArray];
    
    System.out.print("Enter elements in array : ");
    for (int i = 0; i < iSizeArray; i++) {
      iArray[i] = sc.nextInt();
    }
    
    int[] iResultArray = new int[iSizeArray];
    iResultArray = s.plusOne(iArray);
    
    System.out.print("Updated array: ");
    for (int i = 0; i < iSizeArray; i++)
      System.out.print(iResultArray[i]+" ");
  }
}
