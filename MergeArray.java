// Java program to merge to sorted array in non-decreasing order with O(m + n) complexity
import java.util.Scanner;
import java.util.Arrays;

class Solution {
  public int[] merge (int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    
    //Resize nums1 array if needed
    if (nums1.length < m + n)
      nums1 = Arrays.copyOf(nums1, m + n);    
    
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j])
        nums1[k--] = nums1[i--];
      else 
        nums1[k--] = nums2[j--];
    }
    
    // If there're remaining elements in nums2
    while (j >= 0)
      nums1[k--] = nums2[j--];
      
    return nums1;
  }
}

class MergeArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    
    System.out.print("Enter the size of array 1 : ");
    int m = sc.nextInt();
    int[] nums1 = new int[m];
    
    System.out.print("Enter "+m+" elements in array 1: ");
    for (int i = 0; i < m; i++) 
      nums1[i] = sc.nextInt();
      
    System.out.print("Enter the size of array 2 : ");
    int n = sc.nextInt();
    int[] nums2 = new int[n];
    
    System.out.print("Enter "+n+" elements in array 2: ");
    for (int i = 0; i < n; i++) 
      nums2[i] = sc.nextInt();
    
    int[] iResult = s.merge(nums1, m, nums2, n);
    
    for (int num : iResult) 
      System.out.print(num+" ");
    
    sc.close();
  }
}
