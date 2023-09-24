package lession03;

public class lap3_1 {
    public static void main(String[] args) {
        int[] intArr = {11, 88, 23, 39, 14, 35, 68, 78, 48, 96};
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 0; i < intArr.length; i++) {
            int temp = intArr[i] % 2;
            if (temp > 0) {
                oddNumber = oddNumber + 1;
            } else {
                evenNumber = evenNumber + 1;
            }
        }
        System.out.println("There are " + oddNumber + " odd numbers in the array");
        System.out.println("There are " + evenNumber + " even numbers in the array");
    }

}

