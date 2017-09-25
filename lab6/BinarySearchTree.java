//  file name -- BinarySearchTree.java
//  This file contains the declaration of BinarySearchTree class.

import java.io.*;

class BinarySearchTree<ItemType extends Comparable<ItemType>> extends BinaryTree <ItemType>
{
   //  purpose -- add an item to one of the nodes in the current binary
   //             search tree.
   //  preconditions -- item does not exist in the current binary
   //             serach tree.
   //  postconditions -- item is added to one of the nodes in the
   //             current binary search tree.
   private BinaryNode<ItemType> addNode(BinaryNode <ItemType> start,
                                        ItemType item)
   {
      if (start == null) // a new leaf node is created for insertion
      {
         start = new BinaryNode <ItemType>();
         start.info = item;
         start.left = null;
         start.right = null;
      }
      else  // continue to find the place to insert a new node
      {
         if (item.compareTo(start.info) < 0)
            start.left = addNode(start.left, item);
         else
            start.right = addNode(start.right, item);
      }  // else

      return start;
   }  // method addNode


   //  purpose -- search an item in the binary search tree.
   //  preconditions -- none
   //  postconditions -- if item is found in the tree, found is set
   //             true; otherwise, it is set to false
   private void searchNode(BinaryNode <ItemType> start,Item<ItemType> item)
   {
      if (start == null)
      {
         item.setFound(false);
      }  // not found
      else if (item.getItem().compareTo(start.info) == 0)
      {
         item.setItem(start.info);
         item.setFound(true);
      }
      else
      {
         if (item.getItem().compareTo(start.info) < 0)
            searchNode(start.left, item);
         else
            searchNode(start.right, item);
      }
   }  // method searchNode

   public BinarySearchTree() {}


   //  purpose -- add an item to one of the nodes in the current binary
   //             search tree.
   //  preconditions -- item does not exist in the current binary
   //             serach tree.
   //  postconditions -- item is added to one of the nodes in the
   //             current binary search tree.
   public void add(ItemType item)
   {
      root = addNode(this.root, item);
   }  // method add


   //  purpose -- search an item in the binary search tree.
   //  preconditions -- none
   //  postconditions -- if item is found in the tree, found is set
   //             true; otherwise, it is set to false
   public void search(Item<ItemType> item)
   {
      searchNode(this.root, item);
   }  // method search

}  // class BinarySearchTree
