package lession03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lap3_3 {
    public static void main(String[] args) {
        int[] intArr = {11, 88, 23, 39, 14, 35, 68, 78, 48, 96};
        int length = intArr.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (intArr[j] > intArr[j+1]) {
                    //gan intArr[j] vao bien tam
                    temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1]=temp;
                }
            }
        }
        System.out.print("Array: ");
        for (int j = 0; j < intArr.length; j++) {
            System.out.print(intArr[j] + " ");
        }
        //System.out.print("Array: " + Arrays.toString(intArr));

    }

}

