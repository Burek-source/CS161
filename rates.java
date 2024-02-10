/*

Description

Use your knowledge of Strings, arrays, user Input, casting and converting to write a Java program that:

• Casts user inputted Strings to doubles. These Strings represent the hourly rate of pay for employees.
• Store all the values in a double array (of size 5).
• From this double array print to the screen the largest rate of hourly pay and the lowest rate of hourly pay in the format shown in the sample output below. 

Note:

1. You will need to input 5 Strings.
2. All 5 inputted strings will be in the format:

"11.57 is Johns rate of pay."

Sample Input

13.34 is Louises rate of pay 
12.11 is Harrys rate of pay 
14.41 is Emmets rate of pay 
14.12 is Lauras rate of pay 
12.34 is Micks rate of pay

Sample Output

Largest: 14.41
Lowest: 12.11 

*/

import java.util.Scanner;

public class rates 
{
    public static void main(String[] args) 
    {
        String s = new String("");
        double rate = 0.0;
        double[] rates = new double[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            s = sc.nextLine();
            s = s.substring(0, 5);
            rate = Double.parseDouble(s);
            rates[i] = rate;
        }

        double max = rates[0];
        double min = rates[0];

        for(int i = 1; i < rates.length; i++)
        {
            if(rates[i] > max)
            {
                max = rates[i];
            }
            else if(rates[i] < min)
            {
                min = rates[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Lowest: " + min);
    }
}
