package labReport2;

import java.util.Scanner;

public class labReport2Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string value: ");
        String s = scanner.next();
        System.out.print("Enter the k value: ");
        int k = scanner.nextInt();
        System.out.println(question3(s, k));

    }

    public static int question3(String s, int k) {

        char someChar = '?';
        // create an array to indicate the number of ?
        int[] position = new int[]{-1, -1, -1};
        int find = 0;
        int counter = 0;

        // find number of ? and store the index to position array
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == someChar) {
                position[counter] = i;
                counter++;
            }
        }

        StringBuilder sb = new StringBuilder(s);

        // 1st for loop for the 1st occur of ?
        // if the position is -1, mean there is no ? in the string
        for (int i = 0; i < 10 && position[0] != -1; i++) {
            // if the 1st ? is index of 0 , skip 0 counter
            if (position[0] == 0 && i == 0)
                continue;
            // replace the 1st ? with value i
            sb.setCharAt(position[0], (char) (i + '0'));

            // 2nd for loop for the 2nd occur of ?\
            // if the position is -1, mean there is no ? in the string
            for (int j = 0; j < 10 && position[1] != -1; j++) {

                // replace the 2nd ? with value j
                sb.setCharAt(position[1], (char) (j + '0'));

                // 3rd for loop for the 3rd occur of ?
                // if the position is -1, mean there is no ? in the string
                for (int n = 0; n < 10 && position[2] != -1; n++) {

                    // replace the 3rd ? with value n
                    sb.setCharAt(position[2], (char) (n + '0'));

                    // able divide by k , add counter
                    if (Integer.parseInt(sb.toString()) % k == 0) {
                        find++;
                    }
                }

                // if there is no next 3rd ? and able divide by k, we add the counter
                if (Integer.parseInt(sb.toString()) % k == 0 && position[2] == -1) {
                    find++;
                }
            }
            // if there is no 2nd ? and able divide by k, we add the counter
            if (Integer.parseInt(sb.toString()) % k == 0 && position[1] == -1) {
                find++;
            }
        }

        return find;
    }

}