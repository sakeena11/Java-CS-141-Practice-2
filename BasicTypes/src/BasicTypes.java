/*
Intro to basic types in Java (including int and double, the common number types)
Sakeena Younus
CLC MCS 141 - Fall 2021
September 2, 2021
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicTypes {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        //ask the user for their year of birth and then calculate their age this year, 2021
        System.out.println("Hello. What year were you born?");
        int yearOfBirth = keyScan.nextInt();  //reads in an integer from the keyboard and stores it in the variable
        int age = 2021 - yearOfBirth; //calculate the age of the user by subtracting year of birth from current age
        System.out.println("Ok, this year you are " + age + " years old.");

        //ask the user for their height (in feet and inches)
        //then calculate and print their height in just inches and in meters
        System.out.println("How tall are you? Please enter in feet and inches.");
        System.out.println("Feet:");
        int heightFeet = keyScan.nextInt(); //read in the user's height (the feet part of it)
        System.out.println("Inches:");
        int heightInches = keyScan.nextInt(); //get user's height (the inches part of it)
        int heightTotalInches = heightFeet * 12 + heightInches;  //note 12 inches per foot
        System.out.println("You are " +heightTotalInches + " inches tall.");
        double heightMeters = heightTotalInches * 0.0254; //note: 0.0254 meters per inch
        System.out.println("You are " + heightMeters + " meters tall.");

        System.out.println("Thanks for all that personal info! You deserve some free donuts!");
        System.out.println("How many free donuts would you like?");
        int numOfDonuts = keyScan.nextInt();  //get the number of requested donuts
        //we hold 12 donuts in each box, extras go in a bag
        int numOfBoxes = numOfDonuts / 12; //integer division will give us the number of dozens
        int leftOverDonuts = numOfDonuts % 12; //extra donuts that don't make a dozen
        System.out.println("Ok, here are " + numOfBoxes + " dozen donuts and a bag with " +
                leftOverDonuts + " extra donuts");
    }
}
