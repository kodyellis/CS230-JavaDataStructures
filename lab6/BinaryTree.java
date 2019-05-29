//  file name -- BinaryTtree.java
//  This file contains the class BinaryTree.

import java.io.*;

class BinaryNode<ItemType>
{
   ItemType info;
   BinaryNode<ItemType> left;
   BinaryNode<ItemType> right;
}  // class BinaryNode


/*
 * public int count()
 *   {
 * //go to each node
     }

   public int largest()
   * {
   * //keep moving right
   * }
 */

abstract class BinaryTree<ItemType>
{
   protected BinaryNode <ItemType> root;
   int count = 0;

   //  purpose -- visit and process nodes in a preorder traversal
   //  preconditions -- start points to the root of binary tree; one
   //                   points to a function which will process a node in the
   //                   tree.
   //  postconditions -- all nodes in the binary tree are visited in a preorder
   //                   traversal (root, left subtree, right subtree) and each
   //                   node is processed as it is visited.
   protected void preorderVisit(BinaryNode <ItemType> start,
                                NodeProcess<ItemType> one)
   {
      if (start != null)
      {
         one.process(start.info);
         preorderVisit(start.left, one);
         preorderVisit(start.right, one);
      }  // if
   }  // method preorderVisit


   //  purpose -- visit and process nodes in a postorder traversal
   //  preconditions -- start points to the root of binary tree; one
   //                   points to a function which will process a node in the
   //                   tree.
   //  postconditions -- all nodes in the binary tree are visited in a
   //                   postorder traversal (left subtree, right subtree,
   //                   root) and each node is processed as it is visited.
   protected void postorderVisit(BinaryNode <ItemType> start,
                                 NodeProcess<ItemType> one)
   {
      if (start != null)
      {
         postorderVisit(start.left, one);
         postorderVisit(start.right, one);
         one.process(start.info);
      }  // if
   }  // end of binary::postorderVisit


   //  purpose -- visit and process nodes in an inorder traversal
   //  preconditions -- start points to the root of binary tree and
   //                   one points to a function which will
   //                   process a node in the tree.
   //  postconditions -- all nodes in the binary tree are visited in an
   //                   inorder traversal (left subtree, root, right subtree)
   //                   and each node is processed as it is visited.
   protected void inorderVisit(BinaryNode <ItemType> start,
                               NodeProcess<ItemType> one)
   {
      if (start != null)
      {
         inorderVisit(start.left, one);
         one.process(start.info);
         inorderVisit(start.right, one);
      }  // if
   }  // end of binary::inorderVisit

   //  purpose -- default constructor to set root to null
   //  preconditions -- none
   //  postconditions -- the root node is set to null
   public BinaryTree()
   {
      root = null;
   }  // end of BinaryTree:BinaryTree()


   public boolean isEmpty()
   //  purpose -- check to see if the tree is empty
   //  preconditions -- none
   //  postconditions -- return true if the binary tree is empty;
   //                   otherwise, return false
   {
      return (root == null);
   }  // end of binary::isEmpty


   public abstract void add(ItemType item);


   public void preorderTraversal(NodeProcess<ItemType> one)
   //  purpose -- visit and process nodes in a preorder traversal
   //  preconditions -- one points to a function which will process
   //                   a node in the tree.
   //  postconditions -- all nodes in the binary tree are visited in a preorder
   //                   traversal (root, left subtree, right subtree) and each
   //                   node is processed as it is visited.
   {
      preorderVisit(root, one);
   }  // end of binary::preorderTraversal


   public void postorderTraversal(NodeProcess<ItemType> one)
   //  purpose -- visit and process nodes in a postorder traversal
   //  preconditions -- one points to a function which will process
   //                   a node in the tree.
   //  postconditions -- all nodes in the binary tree are visited in a
   //                   postorder traversal (left subtree, right subtree,
   //                   root) and each node is processed as it is visited.
   {
      postorderVisit(root, one);
   }  // end of binary::postorderTraversal


   public void inorderTraversal(NodeProcess<ItemType> one)
   //  purpose -- visit and process nodes in an inorder traversal
   //  preconditions -- one points to a function which will process
   //                   a node in the tree.
   //  postconditions -- all nodes in the binary tree are visited in an
   //                   inorder traversal (left subtree, root, right subtree)
   //                   and each node is processed as it is visited.
   {
      inorderVisit(root, one);
   }  // end of binary::inorderTraversal


   public void counter(NodeProcess<ItemType> one)
   {
      System.out.println(count);
   }


}  // class BinaryTree
