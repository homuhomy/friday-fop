package tutorial7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

/*
* Store ten random integers within 0 to 1000 to a binary file name integer.dat.
* */
public class t7q1c {
    public static void main(String[] args) {
        try{
            String fileName = "integer.dat";
            final int MAX = 1000, totalInt = 10;
            int randomInt;

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            Random generateRandom = new Random();

            for(int i = 0; i<totalInt; i++){
                randomInt = generateRandom.nextInt(MAX + 1);
                outputStream.writeInt(randomInt);
                System.out.println(randomInt);
            }
            outputStream.close();

        }catch(IOException error){
            System.out.println("IO Error " + error.getMessage());
        }
    }
}
