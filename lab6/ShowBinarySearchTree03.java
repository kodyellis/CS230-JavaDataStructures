//  file name -- ShowBinarySearchTree03.java
//  This program demonstrates how to use the BinarySearchTree class.

//  =========================== packages ==============================
import java.io.*;


public class ShowBinarySearchTree03
{
   public static void main(String argumentts[]) throws IOException
   {
      BinarySearchTree <String> one;
      Item<String> item;

      one = new BinarySearchTree<String>();
      one.add("Chris");
      one.add("James");
      one.add("Jackson");
      one.add("April");
      one.add("Wells");
      one.add("Alice");
      one.add("Rice");
      one.add("Melanie");
      one.add("Gail");
      one.add("John");
      one.add("Simpson");
      one.add("Cream");
      one.inorderTraversal(new Print<String>());   

      // perform search
      item = new Item<String>("Creame", true);
      one.search(item);
      System.out.println(item.getItem() + " " + item.isFound());

      item = new Item<String>("Melanie", false);
      one.search(item);
      System.out.println(item.getItem() + " " + item.isFound());
   }  // end of main
} // class ShowBinaryTree03
