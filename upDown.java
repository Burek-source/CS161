/*

Count Up and Down

Write a Java program that prints all of the numbers from 10 to 20 to the screen using a while loop and prints the numbers from 20 to 10 using a for loop

Sample outputs

10 11 12 13 14 15 16 17 18 19 20 
20 19 18 17 16 15 14 13 12 11 10

 */

public class upDown 
{
    public static void main (String[] args)
    {
        int n = 10;

        while(n < 21)
        {
            System.out.print(n + " ");
            n++;
        }

        System.out.println(" ");

        for (int i = 20; i > 9; i--)
        {
            System.out.print(i+ " ");
        }
    }
}
