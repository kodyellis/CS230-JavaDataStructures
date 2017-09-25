/**
  file name -- ShowRead01.java
  This program shows how to read data from the keyboard in Java.
*/


import java.io.*;
import java.util.*;        // for Scanner class
import static java.lang.Math.*;
import java.text.DecimalFormat;


class lab32
{
   public static void main(String list[]) throws IOException
   {
      Scanner source;
      double a,b,c,s,area;
      DecimalFormat two = new DecimalFormat();
      two.setMaximumFractionDigits(2);

      source = new Scanner(System.in);
      int error = 0;

      do {
        //if statennt if side diesnt meet triangkle law then reorint message
        System.out.print("Enter the length of the first side of the triangle: ");
        a = source.nextDouble();

        System.out.print("Enter the length of the second side of the triangle: ");
        b = source.nextDouble();

        System.out.print("Enter the length of the third side of the triangle: ");
        c = source.nextDouble();
        error = 0;

        if ( a > b +c || b > a+c || c > a+c)
        {
          System.out.print("One side of the triangle doesnt meet the hyponenuse law, try a different number.");
          error = 1;
        }

     }while( error == 1);

      // calculate total cost of the shirt's purchased
      s = ( (a + b + c) / 2);
      area = sqrt( s*(s-a)*(s-b)*(s-c) );

      System.out.println("The area of the triangle with sides: " + a + ", " + b + " and " +  c + " is : " + two.format(area));

   }
} // class Triangle
