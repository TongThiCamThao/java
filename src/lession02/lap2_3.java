package lession02;

import java.util.Scanner;

public class lap2_3 {
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
            System.out.println("The BMI above shows that you are underweight.");
            float newWeight = (18.5f * high * high - weight);
            System.out.print("You should gain another " + newWeight + "kg.");
        } else if (MBI < 25) {
            System.out.println("Wow.You have a normal weight.");
            System.out.print("You should maintain this weight!");
        } else if (MBI < 30) {
            System.out.println("The BMI above shows that you are overweight.");
            float newWeight = (weight - 24.9f * high * high);
            System.out.print("You should lose " + newWeight + "kg");
        } else {
            System.out.println("The BMI above shows that you are obesity ");
            float newWeight = (weight - 24.9f * high * high);
            System.out.print("You should exercise to lose another " + newWeight + "kg");
        }

    }

}
