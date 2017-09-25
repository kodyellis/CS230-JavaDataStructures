//  file name -- DoubleList.java
//  This file contains the definition of DoubleList class which is
//  a circular doubly linked list. It also includes an inner class
//  DoubleNode. Since it is an inner class, all members of this
//  clas are public to the methods in the DoubleList class.


//  ======================== packages =======================
import java.io.*;
import java.util.*;

public class DoubleList<ItemType> implements List2<ItemType>
{
   private int size;
   private DoubleNode<ItemType> head;
   private DoubleNode<ItemType> current;


   // ****** inner class DoubleNode ****************************
   private class DoubleNode<ItemType>
   {
      private ItemType data;
      private DoubleNode<ItemType> back_link;
      private DoubleNode<ItemType> next_link;
   }; // class DoubleNode
   //  ------------- end of inner class ************************


   public DoubleList()
   //  purpose -- initialize the list object
   //  precondition -- none
   //  postcondition -- size set to zero, use head to create a dummy
   //                  node, and set both head and current point to the
   //                  dummy node
   {
      makeEmpty();
   }  // constructor


   public void makeEmpty()
   //  purpose -- deallocate the spaces used to hold the list of nodes
   //  precondition -- none
   //  postcondition -- if list is not empty, the list nodes are freed
   //                  from the heap.
   {
      head = new DoubleNode<ItemType>();
      head.next_link = head;
      head.back_link = head;
      size = 0;
      current = head;
   }  // end makeEmpty


   public boolean isEmpty()
   //  purpose -- check to see if the list is empty
   //  precondition -- none
   //  postcondition -- if list is empty, 1 is returned; otherwise 0 is
   //                  returned.
   {
      return (size == 0);
   }  // end isEmpty


   public int length()
   //  purpose -- return the length of the list.
   //  precondition -- none
   //  postcondition -- returns the number of nodes in the list.
   {
      return size;
   }  // end length


   public void insertAfter(ItemType item)
   //  purpose -- insert item to the list.
   //  precondition -- none of the list nodes contains the same key value
   //                  as that in item.
   //  postcondition -- the item is inserted after the current node of the
   //                  list and the the size of the list is incremented
   //                  by 1.
   {
      DoubleNode<ItemType> new_node;

      new_node = new DoubleNode<ItemType>();
      new_node.data = item;

      new_node.back_link = current;
      new_node.next_link = current.next_link;
      current.next_link.back_link = new_node;
      current.next_link = new_node;
      current = new_node;

      size ++;
   }  // end insertAfter


   public void insertBefore(ItemType item)
   //  purpose -- insert item before the current node.
   //  precondition -- none of the list nodes contains the same key value
   //                  as that in item.
   //  postcondition -- the item is inserted after the current in the list
   //                  and the the size of the list is incremented by 1.
   {
      //do if condition for same key value
      DoubleNode<ItemType> new_node;

      new_node = new DoubleNode<ItemType>();
      new_node.data = item;

      new_node.back_link = current.back_link;
      current.back_link = new_node;
      new_node.next_link = current;
      new_node.back_link.next_link = new_node;
      current = new_node;

      size++;
   }  // end insertBefore


   public void delete(ItemType item)
   //  purpose -- delete a node from the list
   //  precondition -- the list has a node containing a key matching that
   //                  of item.
   //  postcondition -- the node containing a key matching that of item is
   //                  removed from the list and size of list is
   //                  decremented by 1.
   {
       while (current.data != item)
       {
              current = current.next_link;
       }

       if (current.data == item)
       {
           current.next_link.back_link = current.back_link;
           current.back_link.next_link = current.next_link;

           size--;
       }
   }  // end delete


   public void resetList()
   //  purpose -- reset current so that it points to the
   //             beginning of the list.
   //  precondition -- none
   //  postcondition -- holds the address of the first node if list is not
   //                   empty; otherwise, it holds NULL value.
   {
      //if (size != 0) {}
      current = head.next_link; // goes to the link in next link of what head piints to
   }  // end resetList


   public void bottom()
   //  purpose -- reset current so that it points to end of list.
   //  precondition -- none
   //  postcondition -- holds the address of the first node if list is not
   //                  empty; otherwise, it holds NULL value.
   {
      current = head.back_link;
   }  // end bottom


   public void advance()
   //  purpose -- advance current to next node.
   //  precondition -- current holds the address of a node.
   //  postcondition -- advance current to the next node.
   {
      if (current != head.back_link)
         current = current.next_link;
      else
         current = head.next_link;
   }  // end advance


   public void moveback()
   //  purpose -- move current to previous node.
   //  precondition -- current holds the address of a node.
   //  postcondition -- move current to the previous node.
   {
      if (current != head.next_link)
         current = current.back_link;
      else
         current = head.back_link;
   }  // end moveback


   public ItemType retrieve()
   //  purpose -- retrieve the current node data from the list.
   //  precondition -- current does not point to the last node of
   //                  the list.
   //  postcondition -- the data of the node referenced to by the
   //                  current is retrieved and copied to item.
   {
      return (current.data);
   }  // end retrieve


   public void replace(ItemType data)
   //  purpose -- replace the data field of the current node.
   //  precondition -- none
   //  postcondition -- data field of current node is replaced with the
   //             data.
   {
      current.data = data;
   }  // end replace

}  // class Double List
