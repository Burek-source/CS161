/*

Description

Write a java program where the largest number in an array gets swapped with the last element in an array, and the smallest element in an array gets swapped with the first element in the array. 
The array's size will be decided by user input and then filled with numbers given by user input. 

Sample Input - first integer is array size entered by the user

5
6
2
8
4
13

Sample Output

2 6 8 4 13 

*/

import java.util.Scanner;

public class smallestLarger 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();

        int smallestIndex = 0;
        int largestIndex = 0;

        int[] numberArray = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++)
        {
            numberArray[i] = sc.nextInt();
        }

        for(int i = 1; i < numberArray.length; i++)
        {
            if(numberArray[i] < numberArray[smallestIndex])
            {
                smallestIndex = i;
            }
            else if(numberArray[i] > numberArray[largestIndex])
            {
                largestIndex = i;
            }
        }

        // Swap the largest number in the array with the last element in the numberArray
        int lastElement = numberArray[sizeOfArray -1];
        numberArray[sizeOfArray-1] = numberArray[largestIndex];
        numberArray[largestIndex] = lastElement;

        // Swap the smallest number in the array with the first element in the array
        int firstElement = numberArray[0];
        numberArray[0] = numberArray[smallestIndex];
        numberArray[smallestIndex] = firstElement;

        for(int num : numberArray)
        {
            System.out.println(num + " ");
        }
    }
}
