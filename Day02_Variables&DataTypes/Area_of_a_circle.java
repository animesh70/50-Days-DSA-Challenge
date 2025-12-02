// To find the area of a circle given its radius input from user

import java.util.*;
public class Area_of_a_circle {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Radius of Circle:");
        float radius = sc.nextFloat();
        float Area = 3.14f * radius * radius;
        System.out.println("The area of the circle is: " + Area);
    }
}

// Output:
// Input Radius of Circle:
// 2
// The area of the circle is: 12.56
