/*

Description

Write a Java program that checks if a date is magic. The date will be entered as either dd/mm/yyyy or d/mm/yyy. For a date to be magic, one of the following conditions must be met.

if dd*mm is a single digit, it must equal the last digit of the year.
if dd*mm is two digits, it must equal the last two digits of the year.
if dd*mm is three digits, it must equal the last three digits of the year.

Sample Input 1

2/2/1954

Sample Output 1

Magic

Explanation 1

2 * 2 = 4

Sample Input 2

3/11/2002

Sample Output 2

Not Magic

Explanation 2

3 * 11 != 02 

*/

import java.util.Scanner;

public class magicDate 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int dd = 0;
        int mm = 0;
        int yy = 0;

        int index = s.indexOf('/');
        int last = s.lastIndexOf('/');

        int times = 0;

        dd = Integer.parseInt(s.substring(0, index));
        mm = Integer.parseInt(s.substring(index + 1, last));

        times = dd * mm;

        if(times < 10)
        {
            yy = Integer.parseInt(s.substring(s.length()-1));

            if(times == yy)
            {
                System.out.println("Magic");
            }
            else
            {
                System.out.println("Not Magic");
            }
        }
        else if(times < 100)
        {
            yy = Integer.parseInt(s.substring(s.length()-2));

            if(times == yy)
            {
                System.out.println("Magic");
            }
            else
            {
                System.out.println("Not Magic");
            }
        }

        else if(times < 1000)
        {
            yy = Integer.parseInt(s.substring(s.length()-3));

            if(times == yy)
            {
                System.out.println("Magic");
            }
            else
            {
                System.out.println("Not Magic");
            }
        }
    }
}
