// file name -- Print.java

// This class implements NodeProces interface

public class Print<ItemType> implements NodeProcess<ItemType>
{
   public void process(ItemType item)
   {
      System.out.println(item);
   }
} // class Print
