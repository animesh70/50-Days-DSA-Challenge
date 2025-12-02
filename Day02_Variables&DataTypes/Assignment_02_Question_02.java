//In a program, input the side of a square. You have to output the area of the square.
import java.util.*;
public class Assignment_02_Question_02{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input side of the square");
    int side = sc.nextInt();
    int Area = side * side;
    System.out.println("Area of the Square is:" + Area );
  } 
}

// Output
// Input side of the square
// 5
// Area of the Square is:25
