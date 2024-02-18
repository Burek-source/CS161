/*

Description

Write a Java program that creates two arrays of length 5 and asks the user to fill them. The program should then find the dot product of the two arrays. 
The dot product can be found by multiplying the value at the corresponding index in both arrays and summing the result together.

Sample Input

1 2 3 4 5
5 4 3 2 1

Sample Output

The dot product is 35 

*/

import java.util.Scanner;

public class dotProduct 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        int dotProduct = 0;
        int sum = 0;

        // Fill the first array with numbers
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = sc.nextInt();
        }

        // Fill the second array with numbers
        for(int i = 0; i < array2.length; i++)
        {
            array2[i] = sc.nextInt();
        }

        // Get the dot product of two arrays
        for(int i = 0; i < array1.length; i++)
        {
            dotProduct = dotProduct + (array1[i] * array2[i]);
        }

        sc.close();

        System.out.println("The dot product is " + dotProduct);
    }
}
