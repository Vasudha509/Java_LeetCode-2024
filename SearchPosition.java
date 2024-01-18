// 35. Search Insert Position
import java.util.Scanner;
class SearchPosition {

  public static int searchInsert(String s)  {
    int count = 0;
    
    for (int i = s.length()-1; i >= 0; --i) {
      if (s.charAt(i) != ' ') {
        count++;
      } else {
        if (count > 0) {
          return count;
        }
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String s = new String();
     
    System.out.print("Enter a string : ");
    s = sc.nextLine();
    
    int result = searchInsert(s);
    
    System.out.println("Length of last word : "+result);
  }
}
