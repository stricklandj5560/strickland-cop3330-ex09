import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    final static int gallonToSqFt = 350;
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            double length, width = 0;
            System.out.print("What's the length of the room? ");
            length = scan.nextDouble();
            System.out.print("What's the width of the room? ");
            width = scan.nextDouble();
            double sqFt = length * width;
            int numGallonsNeeded = (int) Math.ceil(sqFt / gallonToSqFt);
            System.out.println("You will need to purchase " + numGallonsNeeded
                    + " gallons of paint to cover " + sqFt + " square feet.");
            scan.close();
        } catch (Exception e) {

        }
    }
}
