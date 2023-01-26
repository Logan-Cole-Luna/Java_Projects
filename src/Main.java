/*
********************************************************
Class: CS 225
Author Name: Logan Lambeth
Created: <01/21/23>
Modified: <01/25/23> <Finished the code of program>

Purpose:

Attributes:

Methods
********************************************************
 */

import java.util.Scanner;  // Import the Scanner class

class Main
{
    public static double CalculatingSAFunction(double length, double height, double width)
    {
        double result = 0.0;
        return result = 2 * (length * height + width * height + length * width);
    }
    public static double CalculatingSASIFunction(double length, double height, double width)
    {
        double result = 0.0;
        return result = 2.54 * 2.54 * 2 * (length * height + width * height + length * width);
    }

    public static boolean ValidationFunction(double SA, double SASI)
    {
        if(SA == 0.0 && SASI == 0.0)
        {
            System.out.println("Pass");
        }
        else if(SA == 300.0 && SASI == 1935.48)
        {
            System.out.println("Pass");
        }
        else if(SA == 42.0 && SASI == 270.9672)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Test SA =="+SA+" and Test SASI =="+SASI);
            System.out.println("Fail");
            return false;
        }
        return true;
    }

    public static boolean ValidationTable()
    {
        double SATest1 = 0.0, SATest2 = 0.0, SATest3 = 0.0, SASITest1 = 0.0, SASITest2 = 0.0, SASITest3 = 0.0;
        boolean test1 = false, test2 = false, test3 = false;
        SATest1 = CalculatingSAFunction(0.0, 0.0, 0.0);
        SATest2 = CalculatingSAFunction(15.0, 10.0, 0.0);
        SATest3 = CalculatingSAFunction(10.0, 1.0, 1.0);

        SASITest1 = CalculatingSASIFunction(0.0, 0.0, 0.0);
        SASITest2 = CalculatingSASIFunction(15.0, 10.0, 0.0);
        SASITest3 = CalculatingSASIFunction(10.0, 1.0, 1.0);

        test1 = ValidationFunction(SATest1, SASITest1);
        test2 = ValidationFunction(SATest2, SASITest2);
        test3 = ValidationFunction(SATest3, SASITest3);

        if (test1 == true && test2 == true && test3 == true)
        {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("| Test Case |         Input Parameters                    |       Output                |");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("|     1     |   length = height = width = 0.0             | SA == 0.0 SASI == 0.0       |");
            System.out.println("|     2     |   length = 15.0, height = 10.0, width = 0.0 | SA == 300.0 SASI == 1935.48 |");
            System.out.println("|     3     |   length = 10.0, height = width = 1.0       | SA == 42.0 SASI == 270.97   |");
            System.out.println("-----------------------------------------------------------------------------------------");

        }
        else
        {
            System.out.println("The validation of equations has failed");
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        // small methods to do a signle thing, math one should be method

        double SA = 0.0, SASI = 0.0;

       ValidationTable();

        Scanner myObjL = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Length");

        String length = myObjL.nextLine();  // Read user input

        Scanner myObjW = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Width");

        String width = myObjW.nextLine();  // Read user input

        Scanner myObjH = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Height");

        String height = myObjH.nextLine();  // Read user input
        System.out.println("Length is: " + length +" Width is: " + width +" Height is "+ height);  // Output user input

        int l=Integer.parseInt(length);
        int h=Integer.parseInt(width);
        int w=Integer.parseInt(height);

        SA = CalculatingSAFunction(l, h, w);

        SASI = CalculatingSASIFunction(l, h, w);


        System.out.println("Surface Area is: " + SA +" and SASI is: " + SASI);  // Output user input

    }
}