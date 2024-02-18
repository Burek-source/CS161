/*

Description

Write a Java program that prompts the user to input ten decimal point numbers into an array. The program should add every number entered to the previous number entered and
print the calculation to the screen to 2 decimal places. For example: If the numbers entered are:

4.5, 5.5, 6.56, 8.56, -4.53, 9.67, 432.9, 98.56, 3.5, 6.54

the output should be (note the arrangement of the numbers):

5.5 +4.5 = 10.0
6.56+5.5 = 12.06
8.56 + 6.56 = 15.12
...

Appendix

To round a number to 2 decimal places use the code below. The variable num1 will hold the value 12.54 after the following code segment:

double num1= (double)Math.round((12.5376) * 100) / 100;

Below num2 will hold the value 23.69, as 12.122+11.566-23.688.

double num2= (double)Math.round((12.122+11.566) * 100) / 100;

Math.round() returns the closest long or integer. The part" * 100)/100; " decides the amount of decimal places to use. If this part was changed to " * 1000)/1000; " it would round to 3 decimal places, 
which is the amount of zeros. If this part was changed to "*10000)/10000;" it would round to 4 decimal places, which is the amount of zeros. 

*/

import java.util.Scanner;

public class addElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] tenNumbers = new double[10];
        double nums = 0.0;

        int count = 0;

        while(count < 10)
        {
            System.out.println("Enter 10 decimal numbers");
            nums = sc.nextDouble();

            tenNumbers[count] = nums;
            count++;
        }

        for(int i = 1; i < tenNumbers.length; i++)
        {
            double num1 = (double)Math.round((tenNumbers[i-1])* 1000) / 1000;
            double num2 = (double)Math.round((tenNumbers[i])* 1000) / 1000;

            double sum = num1 + num2;
            sum = (double)Math.round((sum)* 100) / 100;

            System.out.println(tenNumbers[i] + " + " + tenNumbers[i-1] + " = " + sum);

            sum = 0;
        }
    }
}
