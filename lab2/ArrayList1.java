// file name -- ArrayList1.java
import java.io.*;
import java.util.*;

/**
   This program shows how to read in student records from an input
   data fle and store them in an array list. Student records are
   stored using an ArrayList object.
*/
public class ArrayList1
{
   private ArrayList<Student> students;
   private Scanner infile;

   public static void main(String[] args)
      throws IOException
   {
      ArrayList1 current;

      current = new ArrayList1();
      current.getStarted();
   } // method main


   /**
      Starts the program
   */
   public void getStarted()
      throws FileNotFoundException
   {
      openFile();
      readData();
      displayResults();
      infile.close();
   } // method getStarted


   /**
      Opens the input data file for read access.
   */
   public void openFile() throws FileNotFoundException
   {
      Scanner input;
      String infile_name;
      File file;

      input = new Scanner(System.in);
      do
      {
         System.out.print("Enter the input file name: ");
         infile_name = input.next();

         // open the input data file
         file = new File(infile_name);
         if (file.exists())
            infile = new Scanner(new File(infile_name));
         else
            System.out.println(infile_name + " does not exist");
      } while (!file.exists());
   } // method openFile


   /**
      Reads in text from file and save them in an array list.
      @param infile the file which has been open successfully
   */
   public void readData()
   {
      Student who;
      String name, first_name, last_name;
      int age;
      double gpa;

      // instantiate an ArrayList object
      students = new ArrayList<Student>();

      // read in values from the file and assign them to the elements
      while (infile.hasNext())
      {
         first_name = infile.next();
         last_name = infile.next();
         name = first_name + " " + last_name;
         age = infile.nextInt();
         gpa = infile.nextDouble();
         who = new Student(name, age, gpa);
         students.add(who);
      }
   } // method readData


   /**
      Displays the student records stored in the array list.
   */
   public void displayResults()
   {
      // display the array elements in sequence
      System.out.println("The list contains " + students.size() +
                         " students");
      for (Student who: students)
         displayStudentRecord(who);
   } // method displayResults


   /**
      Displays the content of each student record.
      @param who a reference to a Student object for display
   */
   public void displayStudentRecord(Student who)
   {
      System.out.println("Name: " + who.getName());
      System.out.println("Age: " + who.getAge());
      System.out.println("GPA: " + who.getGPA());
   } // method displayStudentRecord
} // class ArrayList1
