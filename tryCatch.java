/*

Description

You have been provided with a TryCatch.java file.
The java program contained in the file is supposed to:

• Print to the screen the sum of the contents of an array.
. Print to the screen the product of the contents of an array.
• Print to the screen the contents of the array which are supposed to be filled with user input.

BUT: the program is throwing an error before the product and sum variables are printed to the screen, so:

• Use try, catch and finally blocks to make the program print to the screen the value within product and sum even though the error is occurring.
• Put in a print statement printing to the screen "An error has occurred." within the catch block.
• Use the run tool in the VPL interface to catch the specific type of exception.

DO NOT:

Fix the error.
Change the code except for putting in what is asked of you. 

*/

import java.util.Scanner;

public class tryCatch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[5]; // new integer array of size 5
        int sum = 0; // will hold the value of the sum of the inputs
        int product = 1; // will hold the value of the product of the inputs;

        // for loop to assign each element of the array an integer value
        try
        {
            for(int i = 0; i < array.length; i++)
            {
                array[i] = sc.nextInt();
            }
        }

        catch(Exception e)
        {
            // System.out.println("An error has occured.");
        }

        sc.close();

        /* Assigns product of each value in the array
         * Assigns sum of each value in the array
         */

         try
         {
            for(int i = 0; i <= array.length; i++)
            {
                System.out.print(array[i] + " ");
                product = product * array[i];
                sum = sum + array[i];
            }
         }

         catch(ArrayIndexOutOfBoundsException e)
         {
            System.out.println("An error has occured");
         }

         // Print the product and sum variables contents to the screen
         System.out.println("Product: " + product);
         System.out.println("Sum: " + sum);
    }
}
