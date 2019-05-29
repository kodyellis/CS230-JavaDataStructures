//  file name -- ShowBinarySearchTree01.java

//  This program demonstrates how to use the BinarySearchTree class.

//  ============================ packages =============================
import java.io.*;

public class ShowBinarySearchTree01
{

   public static void main(String arguments[]) throws IOException
   {
      BinarySearchTree<Integer> one;

      one = new BinarySearchTree<Integer>();

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
      one.inorderTraversal(new Print<Integer>());

   }  // method main
} // class ShowBinarySearchTree01
