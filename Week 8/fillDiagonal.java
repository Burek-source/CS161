/*

Description

Write a Java program that creates a 4x4 array. The program should insert a 0 into every
position in the array except along the diagonal. The number to be inserted along the diagonal will be given by user input. Print the array to the screen.

Sample Input

6

Sample Output

6000
0600
0060
0006 

*/

import java.util.Scanner;

public class fillDiagonal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int diagonalNum = sc.nextInt();
        sc.close();

        int diagonalCheck = 0;

        int[][] array = new int[4][4];

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(j == diagonalCheck)
                {
                    array[i][j] = diagonalNum;
                }
                else
                {
                    array[i][j] = 0;
                }
            }

            diagonalCheck++;
        }

        for(int x[] : array)
        {
            for(int y : x)
            {
                System.out.print(y + " ");    
            }
            System.out.println();
        }  
    }
}
