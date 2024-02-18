/*

Description

Binary numbers are numbers in base 2 (with digits: 1, 0)
Write a Java program that performs binary addition on two binary numbers. Use keyboard input to provide the value for the 2 binary numbers. 
In binAddition.java you have been provided with an algorithim to help you solve this question. 
Note:If you are unsure about how to do binary addition please look at the lectures and course textbook.

Sample Input 1

101
10

Sample Output 1

111

Sample Input 2

11010
111

Sample Output 2

100001 

********************************************

You are required to implement the following algorithm to create a Java file that will add two binary numbers together.

A. Ask the user to enter in two binary numbers. You should store these as Strings.
B. Check that the strings have the same number of binary digits in them. If they
do not, then you need to pad the smaller one with o's on the left.
For example, if 1010 and 11 are entered then 11 should be updated to 0011.
You then have two binary numbers of the same length.
C. Starting at the right hand digit in the binary numbers you should add the corresponding numbers together, moving right after each addition.
D. You must convert the individual bits to integers to help with the addition process. E. When adding the corresponding digits together please consider all of the possible combinations, to help determine the output. For example,
0 + 0 = 0, 1 + 0 = 1, 1 + 1 = 10 etc.
You will also need to consider any values that are being carried from right to left.
The following examples show you what the output of two binary additions should be.

101 + 10 = 111
11010 + 111 = 100001

In more detail:
    101
    010 +
------------
    111(result)
    000(carry)
    
    11010
    00111 + 
-------------
    100001(result)
    111110(carry)

If you are unsure about how to do binary addition please look at the lectures and textbook. 

*/


import java.util.Scanner;

public class binAddition 
{
    public static void main(String[] args) 
    {
        String result = new String("");
        char binaryOneC = ' ';
        char binaryTwoC = ' ';
        int carry = 0;

        // A
        Scanner sc = new Scanner(System.in);
        String binaryOne = sc.nextLine();
        String binaryTwo = sc.nextLine();
        sc.close();

        // B
        if(binaryOne.length() < binaryTwo.length())
        {
            while(binaryOne.length() < binaryTwo.length())
            {
                binaryOne = '0' + binaryOne;
            }
        }
        else if(binaryOne.length() > binaryTwo.length())
        {
            while(binaryTwo.length() < binaryOne.length())
            {
                binaryTwo = '0' + binaryTwo;
            }
        }

        // C, D, E
        for(int i = binaryOne.length()-1; i >= 0; i--)
        {
            binaryOneC = binaryOne.charAt(i);
            binaryTwoC = binaryTwo.charAt(i);

            int num1 = binaryOneC - 48;
            int num2 = binaryTwoC - 48;
            int sum = num1 + num2 + carry;

            if(sum == 0)
            {
                result = '0' + result;
                carry = 0;
            }
            else if(sum == 1)
            {
                result = '1' + result;
                carry = 0;
            }
            else if(sum == 2)
            {
                result = '0' + result;
                carry = 1;
            }
            else if(sum == 3)
            {
                result = '1' + result;
                carry = 1;
            }
            if(result.length() == binaryOne.length() && carry == 1)
            {
                result = '1' + result;
            }
        }

        System.out.println(result);
    }
}
