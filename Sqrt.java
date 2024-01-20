// 69. sqrt(x)
import java.util.Scanner;

class Solution {
  public int findSqrt(int x) {
    int start = 1, end = x, mid = -1;
    
    while (start <= end) {
      mid = start + (end - start) / 2;
      
      if (mid*mid > x)
        end = mid - 1;
      else if (mid*mid == x)
        return mid;
      else 
        start = mid + 1;     
    }
    return Math.round(end);
  }
}

class Sqrt{
  public static void main(String[] args) {
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number : ");
    int iNum = sc.nextInt();
    
    int iResult = s.findSqrt(iNum);
    
    System.out.println("Result is : "+ iResult);
  }
}
