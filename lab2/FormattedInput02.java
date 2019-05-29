/**
  file name -- FormattedInput02.java
  This program shows how to read formatted data from a text file.

  The data file contains student records which are formatted as follows:

          Field name            Columns (a.k.a. indexes)
     ==========================================
             Name                1 - 20
             Age                21 - 22
             gpa                23 - 27
             ssNumber           28 - 36
     ==========================================
*/


import java.io.*;
import java.util.*;        // for Scanner class


class FormattedInput02
{
  //final keyword makes these varibales, constant values, meaning you can't change them when aprogram is running.
  //private keyword makes it so that these variables can only be accesed inside of the class.
   private static final int NAME_WIDTH = 20;
   private static final int AGE_WIDTH = 2;
   private static final int GPA_WIDTH = 5;
   private static final int SSNUMBER_WIDTH = 9;

   private Scanner infile;
   private ArrayList<Student> list;

   public static void main(String list[]) throws IOException
   {
      FormattedInput02 one;

     //makes a new instance of this class
      one = new FormattedInput02();
     
      one.getStarted();
   } // method main


   /**
      Default Constructor
      This makes creates a new Student type array list.
   */
   public FormattedInput02()
   {
      list = new ArrayList<Student>();
   } // constructor


   /**
      Starts the program using an object of the class
   */
   public void getStarted() throws FileNotFoundException
   {
      openFile();
      readData();
      display();
   } // method getStarted


   /**
      Opens the input data file for read access.
  */
   public void openFile() throws FileNotFoundException
   {
      Scanner input;
      String infile_name;
      File file;
      
     //Scanner will look for keyboard input.
      input = new Scanner(System.in);
     
      do
      {
         System.out.print("Enter the input file name: ");
        //gets files name. stops looking at keybaord when user presses ENTER
         infile_name = input.next();
        
         file = new File(infile_name);
         if (file.exists())
            infile = new Scanner(file);
         else
            System.out.println(infile_name + " does not exist");
       } while (!file.exists());
   } // method openFile


   /**
      Reads student records from the file and separate the fields of
      each record using substring method.
   */
   public void readData()
   {
      String name, text;
      int age;
      double gpa;
      String ssNumber;
      Student who;

      while (infile.hasNextLine())
      {
         text = infile.nextLine();

         // obtain name field
         name = text.substring(0, NAME_WIDTH); // extract name field
         name = name.trim(); // remove leading and trailing spaces
        //definetly need to use trim here, as we captured the name and all of the space behind them name and placed
        //that into the name variable.

         // remove the whole name field from text. Now substring index can start at 0 again for other variables.
         text = text.substring(NAME_WIDTH, text.length());

         // extract age field from text and convert it to an int type
         age = Integer.parseInt(text.substring(0, AGE_WIDTH));

         // extract gpa field from text and convert it to a double type. We place AGE_WIDTH into the first parameter
        //as gpa is after it.
         gpa = Double.parseDouble(text.substring(AGE_WIDTH, AGE_WIDTH+GPA_WIDTH)); //AGE_WIDTH + GPA_WIDTH

         ssNumber = text.substring(AGE_WIDTH+GPA_WIDTH,AGE_WIDTH+GPA_WIDTH+SSNUMBER_WIDTH);


         who = new Student(name, age, gpa, ssNumber);
         //socialSecurity

         list.add(who);
      } // while infile still has data
   } // method readData


   public void display()
   {
      for (Student who : list)
      {
         System.out.println("Name: " + who.getName());
         System.out.println("Age: " + who.getAge());
         System.out.println("GPA: " + who.getGPA());
         System.out.println("Social Security:" + who.getssNumber());
      } // for still student records available
   } // method display

} // class FormattedInput02
