package tutorial7;

/*
Read from the text file generated in a.
Display all the integer and the largest integer.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class t7q1b {
    public static void main(String[] args) {

        int maxInt = 0, readInt;

        try {
            String fileName = "integer.txt";
            Scanner inputStream = new Scanner(new FileInputStream(fileName)); //need to specify the path if it's not in the project folder

            //can only read by line
            System.out.println("The random integer from text file: ");
            while (inputStream.hasNextLine()) {
                readInt = inputStream.nextInt();
                System.out.println(readInt);
                if (readInt > maxInt) {
                    maxInt = readInt;
                }

            }
            System.out.println("The maximum integer is: " + maxInt);
            inputStream.close();

        } catch (FileNotFoundException error) {
            System.out.println("File not found");
//        }catch (IOException error){
//            System.out.println("IO error: " + error.getMessage());
//        }
        }
    }
}
