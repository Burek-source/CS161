/*

Integer Inputs

Write a program that takes two integer inputs from the user and prints their sum and product to the screen.

Sample input

12
43

Sample output

Sum: 55
Product: 516 

*/

import java.util.Scanner;

public class integerInputs 
{
    public static void main(String[] args) 
    {
        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Product: " + num1 * num2);
    }
}
