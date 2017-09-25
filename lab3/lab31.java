/**
  file name -- ShowRead01.java
  This program shows how to read data from the keyboard in Java.
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
      a = rand.nextInt(54);

      //for loops
      for(int i = 0; i < 6; i++)
      {
         //do the randomization
//while a == 0
//a = rand.Int
//System print out
               a = rand.nextInt(3-1+1)+1;
               System.out.println(a + " ");

      }

   }
} // class Triangle
