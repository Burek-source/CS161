/*

License Plates 2

Our used car salesman wants to upgrade his system that checks the license plates of cars it receives.
For this question, a valid license plate consists of 3 digits between 131 and 232, one capital letter (you can assume this will always be present) and between 3 and 5 more digits.
If either of the numerical requirements are false, you can ignore that license plate. Otherwise, add the license plate to a String array formatted as below (and as in the original question). 
You should then print out this array, one per line. Each test case will have 3 valid license plates.

Sample input

142W123
152G4976
245C123
191L14454
142W497623

Sample output

142-W-123
152-G-4976
191-L-14454 

*/

import java.util.Scanner;

public class licensePlates2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = new String("");
        String licensePlate = new String("");
        String[] licenses = new String[3];
        int count = 0;
        String forLicense = new String("");

        int n1 = 0;
        int n2 = 0;
        int license = 0;

        char c = ' ';

        String firstThreeNumbers = new String("");
        String last5Numbers = new String("");

        while(count < 3)
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
                    forLicense = firstThreeNumbers + "-" + c + "-" + last5Numbers;
                    licenses[count] = forLicense;

                    s = " ";
                    forLicense = "";
                    count++;
                }

                if(license == 1)
                {
                    license = 0;
                }
            }
        }

        for(String i : licenses)
        {
            System.out.println(i);
        }
    }
}
