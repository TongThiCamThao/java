package lession02;

import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class lap2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your weight: ");
        float weight = scanner.nextFloat();
        System.out.print("Input your high: ");
        float high = scanner.nextFloat();
        scanner.close();

        float MBI = (weight / (high * high));
        System.out.println("Your MBI result is " + MBI);

        if (MBI < 18.5) {
            System.out.println("You are underweight");
        } else if (MBI < 25) {
            System.out.println("You have a normal weight");
        } else if (MBI < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obesity ");
        }

    }

}
