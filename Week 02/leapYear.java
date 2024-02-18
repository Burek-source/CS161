/*

Leap Year

Write a Java program with two int variables, year and month. The program should print out how many days are in that month in that year.

Hint:

A year is a leap year if it is divisible by 400 or if it is divisible by 4 and not divisible by 100. So, 1900 was not a leap year, but 2000 and 2004 were.

You also need to print an appropriate message (see sample 2) if the month is invalid.
You must use the variable names given. Declare and initialise year and month on separate lines. Your output must match EXACTLY.

Sample inputs

2023 
10

2023
13

Sample outputs

In October 2023 there were 31 days
Not a valid month

 */

public class leapYear 
{
    public static void main (String[] args)
    {
        int year = 2023;
        int month = 10;

        int daysInFebruary = 28;

        if( year% 400 == 0)
        {
            daysInFebruary = 29;
        }
        else if (year % 4 == 0 && year % 100 !=0)
        {
            daysInFebruary = 29;
        }

        switch(month)
        {
            case 1 : System.out.println("In January " + year + " there were 31 days"); break;
            case 2 : System.out.println("In February " + year + " there were " + daysInFebruary + " days"); break;
            case 3 : System.out.println("In March " + year + " there were 31 days"); break;
            case 4 : System.out.println("In April " + year + " there were 30 days"); break;
            case 5 : System.out.println("In May " + year + " there were 31 days"); break;
            case 6 : System.out.println("In June " + year + " there were 30 days"); break;
            case 7 : System.out.println("In July " + year + " there were 31 days"); break;
            case 8 : System.out.println("In August " + year + " there were 31 days"); break;
            case 9 : System.out.println("In September " + year + " there were 30 days"); break;
            case 10 : System.out.println("In October " + year + " there were 31 days"); break;
            case 11 : System.out.println("In November " + year + " there were 30 days"); break;
            case 12 : System.out.println("In December " + year + " there were 31 days"); break;
            default : System.out.println("Not a valid month"); break;

        }
    }
}
