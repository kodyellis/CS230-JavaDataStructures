//  file name -- ShowBinarySearchTree02.java

//  This program demonstrates how to use the BinarySearchTree class.

//  =========================== packages =============================
import java.io.*;
import java.util.*;


public class ShowBinarySearchTree02
{
   private BinarySearchTree <Integer> tree;
   private Scanner keyboard;
   private final int MAX = 10;

   public static void main(String arguments[]) throws IOException
   {
      ShowBinarySearchTree02 one;

      one = new ShowBinarySearchTree02();
      one.getStarted();
   } // method main


   // default constructor
   public ShowBinarySearchTree02()
   {
      tree = new BinarySearchTree <Integer>();
      keyboard = new Scanner(System.in);
   } // default constructor


   // create the binary search tree first and display the tree
   // using three different traversal methods
   public void getStarted()
   {
      createBinarySearchTree();
      displayInorder();
      displayPreorder();
      displayPostorder();
   } // method getStarted


   void createBinarySearchTree()
   //  This method uses random numbers to create a binary search tree.
   //  The values are generated between -MAX+1 and MAX-1 inclusive.
   {
      Random number = new Random();
      int value;
      int k;

      System.out.println("Numbers to be inserted to the binary search tree are: ");
      for (k = 1; k <= MAX; k ++)
      {
         value = number.nextInt(10 * MAX);
         if (k % 2 == 0)
            value = -value;
         System.out.print(value + " ");
         tree.add(value);
      }  // for k
      System.out.println();
   }  // end of createBinarySearchTree


   void displayInorder()
   //  This function displays the nodes in a binary search tree in an
   //  inorder traveral.
   {
      System.out.println("values printed using an inorder traversal: ");
      tree.inorderTraversal(new Print<Integer>());
   }  // end of displayInorder


   void displayPreorder()
   //  This function displays the nodes in a binary search tree in a
   //  preorder traveral.
   {
      System.out.println("values printed using an preorder traversal: ");
      tree.preorderTraversal(new Print<Integer>());
   }  // end of displayPreorder


   void displayPostorder()
   //  This function displays the nodes in a binary search tree in a
   //  postorder traveral.
   {
      System.out.println("values printed using an postorder traversal: ");
      tree.postorderTraversal(new Print<Integer>());
   }  // end of displayPostorder
}  // class ShowBinarySearchTree02
