package labReport2;

import java.util.Arrays;
import java.util.Scanner;

public class labReport2Question1 {public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // question 1
        System.out.println("Enter the array size ");
        int size = scanner.nextInt();
        int[] array =  new int[size];
        for(int i = 0 ; i < size ; i ++){
            System.out.println("Enter the value of index " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println(question1(array));

}

    public static double question1(int[] array) {

        // sort the array in asc order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        // if the array length  is even
        if (array.length % 2 == 0) {
            // get the middle value and plus the next value divided by 2
            return ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
        } else {
            // for length size is odd, get the middle value
            return (double) array[array.length / 2];
        }
    }





}