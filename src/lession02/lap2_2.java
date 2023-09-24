package lession02;

import java.util.Scanner;

public class lap2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number= scanner.nextInt();
        scanner.close();

        int temp = (number %2);

        if (temp >0) {
            System.out.println("This number is odd number");
        } else {
            System.out.println("This number is even number");
        }

    }

}
