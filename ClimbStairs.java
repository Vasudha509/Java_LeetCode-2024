// 70. Climbing Stairs
import java.util.Scanner;

class Solution {
    public int climbStairs(int n) {
        int ways = 1;

        for (int i = 1; i <= n / 2; i++) {
            double sum = 1;

            for (int j = i; j < 2 * i; j++) {
                sum *= (double)(n - j) / (j - i + 1);
            }
            ways += sum;
        }
        return ways;
    }
}

class ClimbStairs {
  public static void main (String[] args) {
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number of stairs: ");
    int iCount = sc.nextInt();
    
    int iResult = s.climbStairs(iCount);
    System.out.println("Ways to climb stairs : "+ iResult);
  }
}
