package labReport2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class labReport2Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // question 2
        System.out.println("Enter the input for question 2");
        int input = scanner.nextInt();
        System.out.println(question2(input));
}

    public static String question2(int input) {

        int[] allPossible = new int[input/2];
        int find = input;
        int next = 0;

        // get all power of 2 value that within input value
        for (int i = 0; next < input; i++) {
            allPossible[i]=next;
            next = (int) Math.pow(2, i);
        }

        StringBuilder sb = new StringBuilder();

        // loop and find the possible power of 2 value from backward
        for (int i = allPossible.length -1; i > 0 ; i--) {

            // find the target value that is smaller or equal to the find value
            if (find >= allPossible[i] && allPossible[i] != 0) {
                // find value minus the target value
                find -= allPossible[i];

                // add the target value to string
                sb.insert(0, "+" + allPossible[i]);
            }
        }

        // add the front string into the string
        // from + 1 + 2 + 3
        // to 6 = + 1 + 2 + 3
        sb.insert(0, input + "=");

        // remove the 1st occur of plus sign
        // to 6 = 1 + 2 + 3
        sb.deleteCharAt(sb.indexOf("+"));

        return sb.toString();
    }

}