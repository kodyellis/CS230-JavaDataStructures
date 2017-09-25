//  file name -- ShowBinarySearchTree02.java

//  This program demonstrates how to use the BinarySearchTree class.

//  =========================== packages =============================
import java.io.*;
import java.util.*;


public class lab6b
{
   private BinarySearchTree <Integer> tree;
   private Scanner keyboard;
   private final int MAX = 10;

   public static void main(String arguments[]) throws IOException
   {
      lab6b one;

      one= new lab6b();
      one.getStarted();
   } // method main



   public lab6b()
   // default constructor
   {
      tree= new BinarySearchTree <Integer>();
      keyboard = new Scanner(System.in);
   } // default constructor


   public void getStarted() throws FileNotFoundException
      // create the binary search tree first and display the tree
   // using three different traversal methods
   {
      createBinarySearchTree();
      displayInorder();
      greatestNode(tree.root);
      counter(tree.root);
      System.out.println("The Number of nodes is: " + counter(tree.root));  //binary tree name
      System.out.println("The Largest number is: " + greatestNode(tree.root));

   } // method getStarted


   public Scanner openFile() throws FileNotFoundException
   {
      Scanner input, infile = null;
      String infile_name;
      File outfile;

      input = new Scanner(System.in);

      do
      {
         System.out.println("Please enter the input file name: ");

         infile_name = input.next();

         outfile = new File(infile_name);


         try
         {
            infile = new Scanner(outfile);
         }

         catch (FileNotFoundException ex)
         {
               System.out.println(infile_name + " does not exist");
         }

      }while(!outfile.exists());

      return infile;
   }


   void createBinarySearchTree() throws FileNotFoundException
   {

      Scanner infile = openFile();

      while(infile.hasNext())
      {
         tree.add(infile.nextInt());
      }
   }  // end of createBinarySearchTree


   void displayInorder()
   //  This function displays the nodes in a binary search tree in an
   //  inorder traveral.
   {
      tree.inorderTraversal(new Print<Integer>());
   }  // end of displayInorder


   public int greatestNode(BinaryNode<Integer> node)
     // This function will find the largest value in the tree.
   {
      int highest;

      if ( node == null)
         return 0; // if tree is empty

      else
         highest = greatestNode(node.right); //keeps finding nodes

      if(node.info > highest) //adds new highest if the current node is greater
         highest = node.info;

      return highest;
     }
        //end of finding the highest number



  public int counter(BinaryNode<Integer> node)
  // This function count will count the number of nodes in the tree.
  {
      int count = 1;

    if (node == null)
        return 0;

    else
    {
        count += counter(node.left);
        count += counter(node.right);

        return count;
    }
  }
}
  // class lab6b
