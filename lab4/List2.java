//  file name -- List.java
//  This file contains the List interface.

public interface List2<ItemType>
{
   public void makeEmpty();
   public boolean isEmpty();
   //public boolean isLast();
   public int length();
   public ItemType retrieve();
   public void insertBefore(ItemType one);
   public void insertAfter(ItemType one);
   public void delete(ItemType one);
   public void resetList();
   public void bottom();
   public void replace(ItemType one);
   public void advance();
   public void moveback();
}  // interface List2
