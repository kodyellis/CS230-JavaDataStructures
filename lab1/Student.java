// file name -- Student.class

/**
   A class to represent students objects.
*/
public class Student
{
   private String name;
   private int age;
   private double gpa;

   /**
      Initializes the members of a Student object.
      @param name a string representing the name of the student
      @param age an integer representing the age of the student
      @param gpa a double value representing the gpa of the student
   */
   public Student(String name,
                  int age,
                  double gpa)
   {
      this.name = name;
      this.age = age;
      this.gpa = gpa;
   } // constructor


   /**
      Assigns a new name.
      @param name a string representing the student's name
   */
   public void setName(String name)
   {
      this.name = name;
   } // method setName


   /**
      Assigns a new age.
      @param age an integer representing the student's age
   */
   public void setAge(int age)
   {
      this.age = age;
   } // method setAge


   /**
      Assigns a new gpa.
      @param age a double value representing the student's gpa
   */
   public void setGPA(double gpa)
   {
      this.gpa = gpa;
   } // method setGPA


   /**
      Returns the name of the student.
      @return student's name
   */
   public String getName()
   {
      return name;
   } // method getName


   /**
      Returns the age of the student.
      @return student's age
   */
   public int getAge()
   {
      return age;
   } // method getAge


   /**
      Returns the gpa of the student.
      @return student's gpa
   */
   public double getGPA()
   {
      return gpa;
   } // method getGPA

} // class Student
