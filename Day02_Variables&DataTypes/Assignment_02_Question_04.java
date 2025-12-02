/** What will be the type of result in the following Java code?
  byte b = 4;
  char c = 'a';
  short s = 512;
  int i = 1000;
  float f = 3.14f;
  double d = 99.9954;

  result = (f * b) + (i % c) - (d * s); **/

//type of result will be of double type variable because of Type Conversion...


public class Assignment_02_Question_04{
  public static void main (String args []){
    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;

    int result = (f * b) + (i % c) - (d * s);
    System.out.println(result);
  }
}

// Output:
// java Assignment_02_Question_04.java
// Assignment_02_Question_04.java:10: error: incompatible types: possible lossy conversion from double to int
//     int result = (f * b) + (i % c) - (d * s);
//                                    ^
// 1 error
// error: compilation failed
