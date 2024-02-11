/*

Modulus Operator

Write a Java program that uses an int variable called "num" that stores a 4-digit number.
Your program should then break up this number using the modulus operator into its component digits
and print the message exactly as given below.
Make sure to test your program with another 4-digit number, but 1981 should be used for your final answer.


Sample output

The digits in the number 1981 are:

1
9
8
1

 */

 public class modulus
 {
     public static void main (String [] args)
     {
         int num = 1981;
         int numOriginal = num;
         
         int num1 = 0;
         int num2 = 0;
         int num3 = 0;
         int num4 = 0;
 
         // Last number
         num1 = num % 10;
         num = num / 10;
 
         // Third number
         num2 = num % 10;
         num = num / 10;
 
         // Second number
         num3 = num % 10;
         num = num / 10;
 
         // First number
         num4 = num % 10;
 
         System.out.println("The digits in the number " + numOriginal + " are:");
         System.out.println(num4);
         System.out.println(num3);
         System.out.println(num2);
         System.out.println(num1);
     }
 }
 
