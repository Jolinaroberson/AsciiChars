import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class AsciiChars {
    public static void main(String[] args) throws Exception {
    }

    public static void printNumbers() {
        char numbers[] = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
        for (char item1 : numbers) {
            System.out.println(item1);
        }
    }

    public static void printLowerCase() {
        char lowercase[] = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115,
                116, 117, 118, 119, 120, 121, 122 };
        for (char item2 : lowercase) {
            System.out.println(item2);
        }

    }

    public static void printUpperCase() {
        char uppercase[] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
                88, 89, 90 };
        for (char item3 : uppercase) {
            System.out.println(item3);
        }
    }     
}

 //User Input "Enter name" //
 Scanner input = new Scanner(System.in);
 System.out.println("Enter your name: "); 

 //Output "Hello + user name"//
 String name = input.nextLine();
 System.out.println("Hello: " + name);

 //Do you want to continue the interactive portion?//
 Scanner potato = new Scanner(System.in);
 System.out.println("Do you want to continue the interactive portion?");

 //Waiting for user input//
 String line = input.nextLine();
 
 
 if (myAnswer1 == 'yes' 'y'){
System.out.println("Okay. Let me ask you more questions.");
 }
 if (myAnswer2 == 'no' 'n'){
System.out.println("Please return later to complete the survey.");
 }
else {
    System.out.println("Do you want to continue the interactive portion?");
}

 // if the user decided to continue// 
Scanner sc = new Scanner(System.in);

System.out.println("What is your lucky number?")
int a = sc.nextInt();

System.out.println("What is the number associated with your favorite quarterback?");
int b = sc.nextInt();

System.out.println("What is the two-digit model year of your current car?");
int c = sc.nextInt();

System.out.println("Enter a number between 1 and 50.");
int d = sc.nextInt();

System.out.println("What is the name of your favorite actor or actress?");
String e = sc.nextLine();

System.out.println("How old is your favorite pet?");
int f = sc.nextInt();


// Generate the "magic ball"
Random randint = new Random();
int magicBall = b * (randint); 

if (b * (randint) > 75);{// subtract 75 }

// FINDING THE REMAINING LOTTERY NUMBERS//

//Find the 3rd letter of their favorite pet//
int 1 = 

//Use the 2 digit model year of their car and add their lucky number to it//
int 2 = c+a;

//Use the random number between 1 and 50, subtracting one of the generated numbers.//
int 3 = 

//Convert the last letter of their favorite actor.actress to an integer and use that value//
int 4 = 

//Use the value 42
int 5 = '42';

//Use the age of their favorite pet + their car model year //
int 6 = c+f;

//Favorite quarterback number + age of pet + lucky number// 
int 7 = a+b+f;



//LOTTERY NUMBERS ://
System.out.println("Lottery numbers: " + 1,2,3,4,5,6,7);



 

