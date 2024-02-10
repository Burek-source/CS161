/*

Description

Two numbers, x and y, are considered an amicable pair if the sum of the divisors of x, excluding x itself, add up to y and the sum of the divisors of y, excluding y itself, add up to x
E.g. the positive divisors of 220, excluding 220 are: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 and 1 + 2 + 4 + 5 + 10 + 11 +20 +22 +44 +55 + 110 = 284
The positive divisors of 284, excluding 284 are: 1, 2, 4, 71, 142 and 1 + 2 + 4 + 71 + 142 = 220
Given two numbers, find out if they are an amicable pair. If they are, print a message stating that they are and also print the pair sum - the pair sum is the two numbers added together. 
If they aren't an amicable pair print the sum of divisors of each of the numbers.

Note: You should take the numbers in using User Input

Sample Input 1

220
284

Sample Output 1

220 and 284 are an amicable pair
The pair sum is 504

Sample Input 2

345
235

Sample Output 2

345 and 235 are not an amicable pair
The divisors of 345 add to 231
The divisors of 235 add to 53 

*/

import java.util.Scanner;

public class amicablePairs 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int xHalf = x / 2;
        int xSum = 0;

        int yHalf = y / 2;
        int ySum = 0;

        // Get sum of the divisors of x
        for(int i = 1; i <= xHalf; i++)
        {
            if(x % i == 0)
            {
                xSum = xSum + i;
            }
        }

        // Get sum of the divisors of y
        for(int j = 1; j <= yHalf; j++)
        {
            if(y % j == 0)
            {
                ySum = ySum + j;
            }
        }

        // Check if the sums of x and y are amicable
        if(xSum == y && ySum == x)
        {
            System.out.println(x + " and " + y + " are an amicable pair");
            System.out.println("The pair sum is " + (xSum + ySum));
        }
        else
        {
            System.out.println(x + " and " + y + " are not an amicable pair");
            System.out.println("The divisors of " + x + " add to " + xSum);
            System.out.println("The divisors of " + y + " add to " + ySum);
        }
    }
}
