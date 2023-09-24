package lession03;

public class lap3_2 {
    public static void main(String[] args) {
        int[] intArr = {11, 88, 23, 39, 14, 35, 68, 78, 48, 96};
        int minimum = intArr[0];

        int maximum = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (minimum > intArr[i]) {
                minimum = intArr[i];
            }
            if (maximum < intArr[i]) {
                maximum = intArr[i];
            }
        }
        System.out.println("Min of number is: " + minimum);
        System.out.println("Max of number is: " + maximum);
    }

}

