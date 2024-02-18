/*

Calculator 

Write a program that initialises a variable to store a single character and two variables to store whole numbers. The character should be either '+', '/' or '*'. 
The program should check the character and perform the appropriate arithmetic. That is, if the character is '+' then the result of the two numbers added together should be printed to the screen. 
Your two variables to store whole numbers must be integers called numl and num2. Your variable to store a single character must be a char called math. All variables must be declared on individual lines.

Sample inputs 

+ 9 3 
/ 24 4 

Sample outputs 

12 
6 

 */

public class calculator 
{
    public static void main (String[] args)
    {

        char math = '+';

        int num1 = 9;
        int num2 = 3;

        if(math == '+')
        {
            System.out.println(num1 + num2);
        }

        else if (math == '-')
        {
            System.out.println(num1 - num2);
        }

        else if (math == '/')
        {
            System.out.println(num1 / num2);
        }

        else if (math == '*')
        {
            System.out.println(num1 * num2);
        }
    }
}
