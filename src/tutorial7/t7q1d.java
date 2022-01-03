package tutorial7;

import java.io.*;

/*
* Read from the binary file generated in a c. Display the all the integer and the average.
* */
public class t7q1d {
    public static void main(String[] args) {

        int randomInt, sumRandom = 0, count = 0;
        try{
            String fileName = "integer.dat";
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            System.out.println("The random integer from integer.dat is: ");

            try{
                while (true){
                    randomInt = inputStream.readInt();
                    sumRandom += randomInt;
                    count++;
                    System.out.println(randomInt);
                }

            }catch (EOFException e){
            }
            double average = sumRandom/count;
            System.out.printf("The average is: %.2f", average);
            inputStream.close();

        }catch (FileNotFoundException error){
            System.out.println("File not found");
        }catch (IOException error){
            System.out.println("IO error: " + error.getMessage());
        }
    }
}
