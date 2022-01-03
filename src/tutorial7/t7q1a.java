package tutorial7;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class t7q1a {
    public static void main(String[] args) {

        /*
        Store ten random integers within 0 to 1000 to a text file name integer.txt.
        */

        try{
            String fileName = "integer.txt";
            final int MAX = 1000, totalInt = 10;
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName));
            Random generateRandom = new Random();

            for (int i=0; i<totalInt; i++){
                int randomNumber = generateRandom.nextInt(MAX+1);
                outputStream.println(randomNumber);
                System.out.println(randomNumber);
            }
            outputStream.close();

        }catch (IOException error){
            System.out.println("Problem with the output file");
            System.out.println("IO Error: " + error.getMessage()); //print whatever was the error
        }

    }
}
