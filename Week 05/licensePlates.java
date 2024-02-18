/* 

License Plates

A used car salesman wants to check the license plates of cars it receives are valid. You have been tasked to create this program for them.
The program should continuously ask the user for input until the user enters "stop", all lowercase.
For this question, a valid license plate consists of 3 digits between 131 and 232, one capital letter (you can assume this will always be present) and between 3 and 5 more digits.
If either of the numerical requirements are false, you should print "Invalid License Plate". Otherwise, print the 3 parts of the license with a dash between them.

Sample inputs

995C12345
stop

131D4545
123D4545
132D4545
stop

Sample outputs

Invalid License Plate

131-D-4545
Invalid License Plate 
132-D-4545

*/

import java.util.Scanner;

public class licensePlates 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = new String("");
        String licensePlate = new String("");

        int n1 = 0;
        int n2 = 0;
        int license = 0;

        char c = ' ';

        String firstThreeNumbers = new String("");
        String last5Numbers = new String("");

        while(s.equals("stop") == false)
        {
            System.out.println("Enter a license plate: ");
            s = sc.nextLine();
            licensePlate = s;

            if(s.length() > 6 && s.length() < 10)
            {
                firstThreeNumbers = s.substring(0, 3);
                n1 = Integer.parseInt(firstThreeNumbers);

                c = s.charAt(3);

                last5Numbers = s.substring(4);
                n2 = Integer.parseInt(last5Numbers);

                if(n1 < 131 || n1 > 232)
                {
                    license = 1;
                }

                if(n2 > 99999 || n2 < 100)
                {
                    license = 1;
                }

                if(license == 0)
                {
                    System.out.println(firstThreeNumbers + "-" + c + "-" + last5Numbers);

                    s = " ";
                }

                if(license == 1)
                {
                    System.out.println("Invalid License Plate");

                    license = 0;
                }
            }
            else if(licensePlate.length() > 9)
            {
                System.out.println("Invalid License Plate");
            }
        }
    }
}
