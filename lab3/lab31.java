/**
  file name -- lab31.java
*/

import java.io.*;
import java.util.*;        // for Scanner class
import java.util.Random;


class lab31
{
   public static void main(String list[]) throws IOException
   {
      Random rand = new Random();
      int a;

      System.out.println("The Six Numbers Are: ");
     

      //for loops
      for(int i = 0; i < 6; i++)
      {
         //do the randomization
        //need values from 1 to 54. So .nextInt(53) does 0 - 53
        //the 0 itself is set inside the function, so to bypass this we add +1 after than function
        //this way if the funtion returned 0 it would be 1, if it returned 53 it would return 54.
               a = rand.nextInt(53)+1;
               System.out.println(a + " ");

      }

   }
} // class Triangle
