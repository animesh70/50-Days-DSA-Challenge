//Type Conversion:
// Conversion Happens when: 
// a. Type Compatible
// b. Destination Type > Source Type

// byte --> short --> int --> float --> long --> double

// import java.util.*;
// public class Type_Conversion{
//   public static void main(String Args[]){
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextFloat();
//     System.out.println(number);
//   }
// }

// output:
// Type_Conversion.java:12: error: incompatible types: possible lossy conversion from float to int
//     int number = sc.nextFloat();
//                              ^
// 1 error
// error: compilation failed


import java.util.*;
public class Type_Conversion{
  public static void main(String Args[]){
    Scanner sc = new Scanner(System.in);
    float number = sc.nextInt();
    System.out.println(number);
  }
}

// Output:
// 16
// 16.0
