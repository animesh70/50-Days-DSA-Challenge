// To find the sum of two numbers A and B input from user

import java.util.*;
public class Sum_of_A_and_B_input_from_user {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of A:");
        int A = sc.nextInt();
        System.out.println("Enter The value of B:");
        int B = sc.nextInt();
        int Sum = A + B;
        System.out.println("The sum of A and B is: " + Sum);
    }
}

// output :
// Enter The value of A:
// 15
// Enter The value of B:
// 30
// The sum of A and B is: 45
