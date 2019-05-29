//  file name -- ShowBinarySearchTree01.java

//  This program demonstrates how to use the BinarySearchTree class.

//  ============================ packages =============================
import java.io.*;
import java.util.Scanner;


public class ShowBinarySearchTreeLab
{

   public static void main(String arguments[]) throws IOException
   {
      BinarySearchTree<Integer> one;
      one = new BinarySearchTree<Integer>();

      Scanner infile;
      int value;

      infile = new Scanner(new FileReader("lab6.dat")); //reads numbers from file lab6.dat
      while (infile.hasNextInt())  //this is a Loop for getting numbers
      {
         value = infile.nextInt();
         one.add(value);
      }
/*
      one.add(9);
      one.add(15);
      one.add(51);
      one.add(5);
      one.add(1);
      one.add(3);
      one.add(23);
      one.add(83);
      one.add(21);
      one.add(58);
      one.add(71);
      one.add(91);
*/
      one.inorderTraversal(new Print<Integer>());

      //one.count
      //one.largest

   }  // method main
} // class ShowBinarySearchTree01




