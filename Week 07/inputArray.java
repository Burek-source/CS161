/*

Description

Write a program that:

• Takes the array size as input from the user, (use the Scanner class).
• Creates an int array of that size.
• Populates it with values, prompting the user for each value.
• Prints the smallest number in the array and also prints the index of the smallest number in the array, like so: a[1] = 2 is the smallest.
• Prints out the index of any 8s in the array, so for the following array (24 2 6 8 7 8 5 5), the indices of the eights are 3 5.

Sample Input
8
24
2
6
8
7
8
5
5

Sample Output

a[1] 2 is the smallest
the indices of the eights are 3 5 

*/

import java.util.Scanner;

public class inputArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int count = 0;
        int smallest = 0;
        int indexSmallest = 0;
        String eights = new String("the indices of the eights are ");

        int[] values = new int[arraySize];

        while(count < values.length)
        {
            System.out.println("Enter a value: ");
            int value = sc.nextInt();

            if(count == 0)
            {
                smallest = value;
                indexSmallest = count;
            }
            else if( count != 0 && value < smallest)
            {
                smallest = value;
                indexSmallest = count;
            }

            if(value == 8)
            {
                eights = eights + count + " ";
            }

            values[count] = value;
            count++;
        }

        System.out.println("a[" + indexSmallest + "] = " + smallest + " is the smallest");
        System.out.println(eights);
    }
}
