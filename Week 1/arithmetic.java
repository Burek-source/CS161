/*

Arithmetic

Write a Java program and:

1. Declare integers, called num1, num2 and num3, with values 5, 10, and 15 respectively.
2. Declare integers called result1, result2, and set each to a default value of 0.
3. Declare a double called result3 and set it to the value 0.0;
4. Add num1, num2, and num3 together and store the result in result1.
5. Multiply num2 by num3 and store the result in result2.
6. Divide num3 by num1 and store the result in result3.
7. Print the values stored in the variables result1, result2, and result3 to the screen, each on a new line using the same structure as shown in the sample output below.

Please note that you will need to create variables one per line

Sample input

5
10
15

Sample output

Addition: 30
Multiplication: 150
Division: 3.0

 */

public class arithmetic 
{
    public static void main (String[] args)
    {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        int result1 = 0;
        int result2 = 0;

        double result3 = 0.0;

        result1 = num1 + num2 + num3;
        result2 = num2 * num3;
        result3 = num3/num1;

        System.out.println("Addition: " + result1);
        System.out.println("Multiplication: " + result2);
        System.out.println("Division: " + result3);
    }
}
