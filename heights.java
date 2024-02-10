/*

Description

Write a Java program that asks the user to enter ten numbers, each one representing the height of one person in centimetres. These values should be stored in an array. 
The program should count how many people are taller than 180cm and print this total to the screen. 

Sample Input

175 145 188 196 195 184 201 194 153 183

Sample Output

There are 7 people taller than 180cm 

*/

import java.util.Scanner;

public class heights 
{
    public static void main(String[] args) 
    {
        int count = 0, tenNumbers = 0;
        Scanner sc = new Scanner(System.in);
        int[] heightArray = new int[10];

        while(tenNumbers < 10)
        {
            System.out.println("Please enter 10 numbers representing heights of people: ");
            int height = sc.nextInt();

            heightArray[tenNumbers] = height;
            tenNumbers++;

            if(height > 180)
            {
                count++;
            }
        }

        System.out.println("There are " + count + " people taller than 180 cm");
    }
}
