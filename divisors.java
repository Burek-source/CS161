/*

Divisors

Write a Java program that uses a for loop to print all of the divisors of a given number. An example can be been in the sample input/output. You should print your answer as a comma seperated list.
Please use an int called num when storing your initial value

Sample input

24
Sample output

1,2,3,4,6,8,12,24

 */

public class divisors 
{
    public static void main(String[] args) 
    {
        int num = 24;

        for (int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + ",");
            }
        }
    }
}
