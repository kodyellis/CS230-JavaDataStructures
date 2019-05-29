// file name -- Item.java

// This file contains the definition of Item class

public class Item<ItemType>
{
   private ItemType item;
   private boolean found;

   public Item(ItemType item,
               boolean found)
   {
      this.item = item;
      this.found = found;
   } // constructor


   public ItemType getItem()
   {
      return item;
   } // method getItem


   public boolean isFound()
   {
      return found;
   } // method isFound


   public void setItem(ItemType item)
   {
      this.item = item;
   }  // method setItem


   public void setFound(boolean found)
   {
      this.found = found;
   } // method setFound
}
