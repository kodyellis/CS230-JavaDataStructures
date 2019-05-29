//  file name - Driver01.java

//  This program serves as the test driver for DoubleList class.
//
//  Classes needed: DoubleList
//
//  Interface used: List2


//  ============================ packages ===========================
import java.io.*;
import java.util.*;


public class Driver01
{

   public static void main(String arguments[]) throws IOException
   {
      DoubleList<Integer> one;

      one = new DoubleList<Integer>();

      // case 1: adding a node to an empty list
      System.out.println("adding a node to an empty list");
      one.insertAfter(3);

      // case 2: adding a node after current node
      System.out.println("adding a node after current node");
      one.insertAfter(5);
        //output should be 3 5 7 8
      //                                         8 7 5 3

      // case 3: adding a node after current node
      System.out.println("adding a node after current node");
      one.insertAfter(8);
      one.insertBefore(7);

      // display nodes in the list
      System.out.println("displaying nodes from beginning of list");
      one.resetList();
      for (int index = 0; index < one.length(); index++)
      {
         System.out.print(one.retrieve() + " ");
         one.advance();
      }
      System.out.println();

      // display nodes in the list in reverse order
      System.out.println("displaying nodes from end of list");
      one.bottom();
      for (int index = 0; index < one.length(); index++)
      {
         System.out.print(one.retrieve() + " ");
         one.moveback();
      }
      System.out.println();


      // display nodes with 3 deleted from the list
      System.out.println("display nodes with 3 deleted from the list");
      //one.resetList();
      one.delete(5);
      for (int index = 0; index < one.length(); index++)
      {
         System.out.print(one.retrieve() + " ");
         one.advance();
      }
      System.out.println();

   }  // end of main

} // class Driver01
