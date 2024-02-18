/*

Retirement Age 

Write a Java program that checks to see if the age of a person is greater than or equal to 66. If it is, print out that the person is retired; otherwise, print they are not retired. Use an integer variable age to represent the age of the person. 
You must use the values given and you must not "hard-code" results. 

Sample inputs 
67 
24 
Sample outputs 

Person is retired 
Person is not retired 

 */

public class retirement 
{
    public static void main (String[] args)
    {
        int age = 67;

        if (age >= 66)
        {
            System.out.println("Person is retired");
        }
        else
        {
            System.out.println("Person is not retired");
        }
    }
}
