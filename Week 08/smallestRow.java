/*

Description

Write a Java program that will:

1. Create a square integer 2D array of a size that is decided by user input (one input).
2. Allow the user to fill the array with integers of their choice.
3. Determine which row has the smallest sum.
4. Print to the screen a string starting with "R" and then the number of the row with no spaces. For example "R2".

Example 2D Array:

| 1 2 |
| 3 4 |

Sample Input

2 1 2 3 4

Sample Output

Smallest row = R1 

*/

import java.util.Scanner;

public class smallestRow 
{
    public static void main(String[] args) 
    {
        int sum = 0;
        int tempSum = 0;
        int rowNumber = 0;

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[][] square = new int[arraySize][arraySize];
        int[] sums = new int[arraySize];

        // Populate 2D array with integers
        for(int i = 0; i < square.length; i++)
        {
            for(int j = 0; j < square.length; j++)
            {
                int num = sc.nextInt();
                square[i][j] = num;
            }
        }

        // Calculate sum of each row
        for(int i = 0; i < square.length; i++)
        {
            for(int j = 0; j < square.length; j++)
            {
                tempSum = tempSum + square[i][j];
            }
            sums[i] = tempSum;
            tempSum = 0;
        }

        sum = sums[0];

        // Find the row with the smallest sum
        for(int i = 1; i < sums.length; i++)
        {
            if(sums[i] < sum)
            {
                sum = sums[i];
                rowNumber = i + 1;
            }
        }

        System.out.println("Smallest row = R" + rowNumber);
    }
}
