/*

Array Interaction

Write a program which takes in the values to fill two 4x5 arrays. You should fill one array first, then the second array. Your program should then create a new third 4x5 array.
Each element in this array should be determined by multiplying the corresponding values in both other arrays, and then multiplying by the current row number (where the first row is Row 1, not Row 0).
For example, if array1[0][0] = 5 and array2[0][0] = 10, then array3[0][0] should equal 50 because 5*10*1 = 50. 1 in this case being the row number.
Once you have populated your new array, you should print all values to the screen in a 4x5 grid pattern.
Sample input

1 2 3 4 5 6 7 8 9 10 10 9 8 7 6 5 4 3 2 1 1 2 3 4 5 6 7 8 9 10 10 9 8 7 6 5 4 3 2 1

Sample output

1 4 9 16 25
72 98 128 162 200
300 243 192 147 108
100 64 36 16 4 

*/

import java.util.Scanner;

public class arrayInteraction 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[4][5];
        int[][] arr2 = new int[4][5];
        int[][] arr3 = new int[4][5];

        int sum = 0;

        // Array 1
        for(int rows = 0; rows < arr1.length; rows++)
        {
            for(int colms = 0; colms < arr1[rows].length; colms++)
            {
                arr1[rows][colms] = sc.nextInt();
            }
        }

        // Array 2
        for(int rows = 0; rows < arr2.length; rows++)
        {
            for(int colms = 0; colms < arr2[rows].length; colms++)
            {
                arr2[rows][colms] = sc.nextInt();
            }
        }

        // Array 3
        for(int rows = 0; rows < arr3.length; rows++)
        {
            for(int colms = 0; colms < arr3[rows].length; colms++)
            {
                sum = arr1[rows][colms] * arr2[rows][colms] * (rows + 1);
                arr3[rows][colms] = sum;
            }
        }

        for(int rows = 0; rows < arr3.length; rows++)
        {
            for(int colms = 0; colms < arr3[rows].length; colms++)
            {
                System.out.print(arr3[rows][colms] + "");
            }
            System.out.println();
        }

        sc.close();


    }
}
