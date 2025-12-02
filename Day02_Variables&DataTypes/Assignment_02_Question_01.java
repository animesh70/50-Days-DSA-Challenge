//In a Program,input 3 numbers: A, B and C. You have to output the average of these 3 numbers.
import java.util.*;
public class Assignment_02_Question_01{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value for A");
    int A = sc.nextInt();
    System.out.println("Enter the value for B");
    int B = sc.nextInt();
    System.out.println("Enter the value for C");
    int C = sc.nextInt();
    int Avg = (A+B+C)/3;
    System.out.println("The avg of 3 number is:" + avg);
  }
}

// Output:
// Enter the value for A
// 2
// Enter the value for B
// 3
// Enter the value for C
// 5
// The avg of 3 number is:3
