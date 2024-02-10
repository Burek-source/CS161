/*

Description

Write a Java program that takes a module code from User Input. The program should continuously ask the user for input until the user enters "stop" or "STOP". 
Module codes consist of 2 letters followed by 3 digits. You should confirm this is a valid module code by converting the digits from a string to a number. 
The program should take the letters and determine what department the module is from. It should then take the first number and determine which year of study the module is from.

For example:

CS161 is a valid year 1 Computer Science module code
The following are valid departments

CS->Computer Science
EE->Electronic Engineering
BI->Biology
MT->Maths
CH->Chemistry
Cl->Chinese
BS->Business

If a module code does not match one of these departments your program should print "Invalid module code"

Sample Input 1

CS161
Sample Output 1

CS161 is a valid year 1 Computer Science module code

Sample Input 2

EE421

Sample Output 2

EE421 is a valid year 4 Electronic Engineering module code

Sample Input 3

ZH321

Sample Output 3

Invalid module code 

*/

import java.util.Scanner;

public class codes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String moduleCode = new String("");
        String moduleDepartment = new String("");
        String correctDepartment = new String("");
        String validCodes = new String("0123456789CSEBMTHIS");

        int year = 0;

        String cS = new String("Computer Science module code");
        String eE = new String("Electronic Engineering module code");
        String bI = new String("Biology module code");
        String mT = new String("Maths module code");
        String cH = new String("Chemistry module code");
        String cI = new String("Chinese module code");
        String bS = new String("Business module code");

        int length = 0, hexNum = 0;

        while(moduleCode.toUpperCase().equals("STOP") == false)
        {
            System.out.println("Please enter module code: ");
            moduleCode = sc.nextLine();
            length = moduleCode.length();

            while(length != 0)
            {
                char c = moduleCode.charAt(length-1);
                hexNum = validCodes.indexOf(c);

                length -= 1;

                if(hexNum == -1 && moduleCode.toUpperCase().equals("STOP") == false)
                {
                    System.out.println("Invalid module code");
                    length = 0;
                }
            }

            moduleDepartment = moduleCode.substring(0, 2);

            if(moduleDepartment.equals("CS"))
            {
                correctDepartment = cS;
            }
            else if(moduleDepartment.equals("EE"))
            {
                correctDepartment = eE;
            }
            else if(moduleDepartment.equals("BI"))
            {
                correctDepartment = bI;
            }
            else if(moduleDepartment.equals("MT"))
            {
                correctDepartment = mT;
            }
            else if(moduleDepartment.equals("CH"))
            {
                correctDepartment = cH;
            }
            else if(moduleDepartment.equals("CI"))
            {
                correctDepartment = cI;
            }
            else if(moduleDepartment.equals("BS"))
            {
                correctDepartment = bS;
            }
            else
            {
                correctDepartment = "";
            }

            if(!correctDepartment.equals(""))
            {
                char third = moduleCode.charAt(2);
                year = third - 48;

                switch (year) 
                {
                    case 1 : System.out.println(moduleCode + " is a valid year 1 " + correctDepartment); break;
                    case 2 : System.out.println(moduleCode + " is a valid year 2 " + correctDepartment); break;
                    case 3 : System.out.println(moduleCode + " is a valid year 3 " + correctDepartment); break;
                    case 4 : System.out.println(moduleCode + " is a valid year 4 " + correctDepartment); break;
                    default : System.out.println("Invalid module code"); break;
                }
            }
        }
    }
}
