/*

Eircode

An Eircode is a unique 7-character code consisting of letters and numbers. Each Eircode consists of a 3-character routing key to identify the area and a 4-character unique identifier for each address, 
for example W23 F854. The routing key is the first three characters of an Eircode. The unique identifier is a group of 4 characters and comes after the routing key.
You are required to write a program that stores an Eircode in a String called eircode and print out the routing key and the unique identifier of that Eircode.
It should then determine which area the Eircode belongs to, based on the following routing key values:

Dunboyne: A86
Dungarvan: X35
Edenderry: R45
Maynooth: W23
Shannon: V14

You must use a String variable called eircode which is described and initialised as follows:

String eircode = "W23V6V8";

Make sure that you match the format of the output exactly as shown below.

Sample inputs

W23F484
R45W2R4
R14V7V8

Sample outputs

Key: W23-Identifier: F484-Area: Maynooth.
Key: R45-Identifier:W2R4-Area: Edenderry.
Key:R14-Identifier: V7V8-Area:Other. 

*/

public class eircode 
{
    public static void main(String[] args) 
    {
        String eircode = "W23V6V8";

        char c = eircode.charAt(0);

        switch(c)
        {
            case 65 : System.out.println("Key:" + eircode.substring(0, 3) + "-Identifier:" + eircode.substring(3) + "-Area:Dunboyne."); break;
            case 88 : System.out.println("Key:" + eircode.substring(0, 3) + "-Identifier:" + eircode.substring(3) + "-Area:Dungarvan."); break;
            case 82 : System.out.println("Key:" + eircode.substring(0, 3) + "-Identifier:" + eircode.substring(3) + "-Area:Edenderry."); break;
            case 87 : System.out.println("Key:" + eircode.substring(0, 3) + "-Identifier:" + eircode.substring(3) + "-Area:Maynooth."); break;
            case 86 : System.out.println("Key:" + eircode.substring(0, 3) + "-Identifier:" + eircode.substring(3) + "-Area:Shannon."); break;
            default : System.out.println("Key:" + eircode.substring(0, 3) + "-Identifier:" + eircode.substring(3) + "-Area:Other."); break;
        }
    }
}
