// FILE: IsBalancedDemonstration.java
// This small demonstration program showing the isBalanced method, which uses
// a stack of characters to determine whether a string has balanced
// parentheses.

import java.util.Stack;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IsPostFixExpression
{

   // This pattern will match just the first character of the next token:
   public static final Pattern CHARACTER = Pattern.compile("\\S.*?");
   // These patterns match numbers at the start of the next token. The UNSIGNED versions
   // must not have a plus or minus sign at the front:
   //public static final Pattern DOUBLE = Pattern.compile("([+-]?((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
   //public static final Pattern DOUBLE = Pattern.compile("([+-]?((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
   public static final Pattern INT = Pattern.compile("[+-]?\\d+.*?");
   public static final Pattern UNSIGNED_DOUBLE = Pattern.compile("((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
   public static final Pattern UNSIGNED_INT = Pattern.compile("\\d+.*?");



   public static double evaluate(String expression)
   {
      Stack<Double> numbers = new Stack<Double>();
      //Stack<Double> operations = new Stack<Character>();

      Scanner input = new Scanner(expression);
      String next;

      while (input.hasNext())
      {
         if (input.hasNext(UNSIGNED_INT))
         {
            next = input.findInLine(UNSIGNED_INT);
            numbers.push(new Double(next));
         }

         else
         {
            next = input.findInLine(CHARACTER);
            Character operation = next.charAt(0);

            switch (operation)
            {
               case '+':
               case '-':
               case '*':
               case '/':
                  evaluateStackTops(numbers, operation);
                  break;
               default :
                  throw new IllegalArgumentException("Illegal input expression");
            }
         }
      }

      if (numbers.size() != 1)
      {
         throw new IllegalArgumentException("Illegal input expression");
      }

      System.out.println(numbers.get(0));
      return numbers.pop();
   }






   public static void evaluateStackTops(Stack<Double> numbers, Character operation)//, Stack<Character> operations)
   {
      double operand1, operand2;

      if (numbers.size() < 2)//( || (operations.isEmpty()))
         throw new IllegalArgumentException("Illegal expression");

      operand2 = numbers.pop();
      operand1 = numbers.pop();

      switch(operation)//operations.pop())
      {
         case '+':
            numbers.push(operand1 + operand2);
            break;
         case '-':
            numbers.push(operand1 - operand2);
            break;
         case '*':
            numbers.push(operand1 * operand2);
            break;
         case '/':
            numbers.push(operand1 / operand2);
            break;

         default: throw new IllegalArgumentException("Illegal operation");
      }
   }






   public static void main(String[ ] args)
   {
      Scanner stdin = new Scanner(System.in);
      String expression;

      System.out.println("Please type the post fix expression containing"); //
      System.out.println(" a b c d e f- + / *. I'll check whether"); //
      System.out.println("the postfix expresion are balanced.");  //

      do
      {
         System.out.print("Your string: ");
         expression = stdin.nextLine();  //expression contains no value its just a variable atm
         evaluate(expression);
      }
      while (query(stdin, "Thats is correct, do you want to input another string?"));

      System.out.println("Thanks for that postfix expression.");
   }



   public static boolean query(Scanner input, String prompt)
   {
      String answer;

      System.out.print(prompt + " [Y or N]: ");
      answer = input.nextLine( ).toUpperCase( );
      while (!answer.startsWith("Y") && !answer.startsWith("N"))
      {
          System.out.print("Invalid response. Please type Y or N: ");
          answer = input.nextLine( ).toUpperCase( );
      }

      return answer.startsWith("Y");
   }

}
