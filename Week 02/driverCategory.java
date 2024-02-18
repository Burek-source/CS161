/*
Drivers License Categories 

Write a Java program that uses if selection statements to print out which type of vehicle a driver's license allows them to drive. 
Declare a character variable called license. Your program should check the value of the character variable and print out an appropriate message based on the value stored in it. 

'a' allows you to drive motorcycles 
'b' allows you to drive cars 
'c' allows you to drive trucks 
'd' allows you to drive buses 

Following the sample outputs below, print out which vehicle the license holder can drive. You should set the 'license' variable to a in your code. 
You must use the values given and you must not "hard-code" results. 

Sample inputs 

a 
b 
c
d 

Sample outputs 

Motorcycle 
Car 
Truck 
Bus 


 */

 public class driverCategory 
 { 
    public static void main (String [] args) 
    { 
        char license = 'c'; 

        if (license == 'a') 
        { 
            System.out.println("Motorcycle"); 
        } 

        else if (license == 'b') 
        { 
            System.out.println("car"); 
        } 

        else if (license == 'c') 
        { 
            System.out.println("Truck"); 
        } 

        else if (license == 'd') 
        { 
            System.out.println("Bus"); 
        }   
    }       
} 
    
    
