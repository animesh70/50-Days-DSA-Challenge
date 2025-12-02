// To find the product of two numbers A and B input from user

import java.util.*;
public class Product_of_A_and_B{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of A:");
        int A = sc.nextInt();
        System.out.println("Enter The value of B:");
        int B = sc.nextInt();
        int Product = A * B;
        System.out.println("The product of A and B is: " + Product);
    }
}

// Output:
// Enter The value of A:
// 10
// Enter The value of B:
// 5
// The product of A and B is: 50
