package cstevens_week3;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 3 Assignment
 * @Date: Jun 6, 2021
 * @Description: Selections
 */
import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // create an object of the Scanner
        Scanner input = new Scanner(System.in);

        // print selection menu
        System.out.println("Please select an area to determine from"
                + "\nthe following menu choices:\n");
        System.out.println("1. Determine the area of a Square");
        System.out.println("2. Determine the area of a Circle");
        System.out.println("3. Determine the area of a Ellipse");
        System.out.println("4. Determine the area of a Pentagon");
        System.out.println("5. Exit\n");
        System.out.print("Choice: ");

        // take input for user choice
        int shape = input.nextInt();

        //SWITCH CASE        
        switch (shape) {
            
            // area of a square
            case 1:
                System.out.print("\nEnter the side of a square: ");
                
                // take input for side of square (aSq)
                int aSq = input.nextInt();
                
                // print formula, calculate and print area
                System.out.println("The formula for the area of a square is:"
                        + " a^2");
                System.out.println("The area of a square with side of " + aSq
                        + " is: " + pow(aSq, 2) + "\n");
                break;
            
            // area of a cricle
            case 2:
                System.out.print("\nEnter the radius of a circle: ");
                
                // take input for radius of circle (r)
                int r = input.nextInt();
                
                // print formula, calculate and print area
                System.out.println("The formula for the area of a circle is:"
                        + " Pi*r^2");
                System.out.println("The area of a circle with radius of " + r
                        + " is: " + PI*pow(r, 2) + "\n");
                break;
            
            // area of an ellipse
            case 3:
                System.out.print("\nEnter the radius 1 of an ellipse: ");
                
                // take input for radius 1 of ellipse (aEll)
                int aEll = input.nextInt();
                System.out.print("Enter the radius 2 of an ellipse: ");
                
                // take input for radius 2 of ellipse (bEll)
                int bEll = input.nextInt();
                
                // print formula, calculate and print area
                System.out.println("The formula for the area of an ellipse is:"
                        + " Pi*a*b");
                System.out.println("The area of an ellipse with radii of "
                        + aEll + " & " + bEll + " is: " + PI * (aEll * bEll)
                        + "\n");
                break;
            
            // area of pentagon
            case 4:
                System.out.print("\nEnter the side of a pentagon: ");
                
                // take input for side of pentagon (aPen)
                int aPen = input.nextInt();
                
                // print formula, calculate and print area
                System.out.println("The formula for the area of a pentagon is:"
                        + " 1/4*sqrt(5*(5+2*sqrt5)*a^2)");
                System.out.println("The area of a pentagon with side of " + aPen
                        + " is: "
                        + (sqrt(5 * (5 + 2 * (sqrt(5)))) * pow(aPen, 2) / 4)
                        + "\n");
                break;
            
            // print goodbye statement and exit program
            case 5:
                System.out.println("Exiting program, Goodbye.\n");
                System.exit(0);
            
            // print invalid selection statement and exit program w/error code 1
            default:
                System.out.println("Invalid selection. Exiting program.\n");
                System.exit(1);
        }

        //IF ELSE
        
//        // area of a square
//        if (shape == 1) {
//            System.out.print("\nEnter the side of a square: ");
//            
//            // take input for side of square (aSq)
//            int aSq = input.nextInt();
//            
//            // print formula, calculate and print area
//            System.out.println("The formula for the area of a square is:"
//                    + " a^2");
//            System.out.println("The area of a square with side of " + aSq
//                    + " is: " + pow(aSq, 2) + "\n");
//        
//        // area of a circle
//        } else if (shape == 2) {
//            System.out.print("\nEnter the radius of a circle: ");
//            
//            // take input for radius of circle (r)
//            int r = input.nextInt();
//            
//            // print formula, calculate and print area
//            System.out.println("The formula for the area of a circle is:"
//                    + " Pi*r^2");
//            System.out.println("The area of a circle with radius of " + r
//                    + " is: " + PI * pow(r, 2) + "\n");
//        
//        // area of an ellipse
//        } else if (shape == 3) {
//            System.out.print("\nEnter the radius 1 of an ellipse: ");
//            
//            // take input for radius 1 of ellipse (aEll)
//            int aEll = input.nextInt();
//            System.out.print("Enter the radius 2 of an ellipse: ");
//            
//            // take input for radius 2 of ellipse (bEll)
//            int bEll = input.nextInt();
//            
//            // print formula, calculate and print area
//            System.out.println("The formula for the area of an ellipse is:"
//                    + " Pi*a*b");
//            System.out.println("The area of an ellipse with radii of "
//                    + aEll + " & " + bEll + " is: " + PI * (aEll * bEll)
//                    + "\n");
//        
//        // area of a pentagon
//        } else if (shape == 4) {
//            System.out.print("\nEnter the side of a pentagon: ");
//            
//            // take input for side of pentagon (aPen)
//            int aPen = input.nextInt();
//            
//            // print formula, calculate and print area
//            System.out.println("The formula for the area of a pentagon is:"
//                    + " 1/4*sqrt(5*(5+2*sqrt5)*a^2)");
//            System.out.println("The area of a pentagon with side of " + aPen
//                    + " is: "
//                    + (sqrt(5 * (5 + 2 * (sqrt(5)))) * pow(aPen, 2) / 4)
//                    + "\n");
//        
//        // print goodbye statement and exit program
//        } else if (shape == 5) {
//            System.out.println("Exiting program, Goodbye.\n");
//            System.exit(0);
//        
//        // print invalid selection statement and exit program w/error code 1
//        } else {
//            System.out.println("Invalid selection. Exiting program.\n");
//            System.exit(1);
//        }
    } //End Main Method

} //End Class Main
