/*

Bus Fares Ternary

Write a Java program that prints out the bus fare depending on whether the user is an adult or a child. If adult, the fare is 2.05, if child the fare is 0.65.
You must use the ternary operator.

A variable of type char called passenger should have the value 'A' or 'C' which shows if the user is an adult or child. A double called fare holds the fare to pay.
You must use the values given and you must not "hard-code" results.

Sample inputs

A
C
Sample outputs

The fare is: 2.05
The fare is: 0.65

 */

public class busFares 
{
    public static void main (String[] args)
    {
        char passenger = 'C';

        double fare = 0.0;

        fare = (passenger == 'A') ? 2.05 : 0.65;
        System.out.println("The fare is: " + fare);
    }
}
