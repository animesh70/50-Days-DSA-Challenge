/** Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) **/

import java.util.*;

public class Assignment_02_Question_03 {
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Pencil: ");
        float Pencil = sc.nextFloat();
        System.out.println("Enter the price of Pen: ");
        float Pen = sc.nextFloat();
        System.out.println("Enter the price of Eraser: ");
        float Eraser = sc.nextFloat();
        float Sub_Total = Pencil + Pen + Eraser;
        float Tax_Amount = (18.0f/100.0f) * Sub_Total;
        float Total_Bill = Sub_Total + Tax_Amount;
        System.out.println("---- Animesh Store ---- \n");
        System.out.println("Price of Pencil: " + Pencil);
        System.out.println("Price of Pen: " + Pen);
        System.out.println("Price of Eraser: " + Eraser);
        System.out.println("Sub Total: "  + Sub_Total);
        System.out.println("Tax Amount: " + Tax_Amount);
        System.out.println("Total Bill After Tax: " + Total_Bill);
  }
}   

/** Output:
Enter the price of Pencil: 
4
Enter the price of Pen: 
5
Enter the price of Eraser: 
6
---- Animesh Store ---- 

Price of Pencil: 4.0
Price of Pen: 5.0
Price of Eraser: 6.0
Sub Total: 15.0
Tax Amount: 2.7
Total Bill After Tax: 17.7 **/
