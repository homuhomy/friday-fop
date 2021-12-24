package tutorial5;

import java.util.Arrays;

public class Tutorial5Question1 {
    public static void main(String[] args) {
//        a. Declare an array that used to store 12 floating point numbers.
        float arrayFloat [] = new float[12];
        //dataType arrayName[] = new dataType[size of array]
        //or
        //dataType[] arrayName = new dataType[size of array]
        Arrays.fill(arrayFloat, 9.2f); //fill array

        //another way
        float arrayFloat2[] = {2.5f,3.5f,6.5f};
        System.out.println(Arrays.toString(arrayFloat)); //can also use loop and it will not print out bracket
        System.out.println(Arrays.toString(arrayFloat2));


//   b.  	Initialize an array that used to store the value of A to E.
        char arrayLetter [] = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("");
        System.out.println(Arrays.toString(arrayLetter));

//        c.   	Declare an array that used to store 100 students name.
        String arrayStudent [] = new String[10];
        //Arrays.fill(arrayStudent, "Homu");
        System.out.println("");
        System.out.println(Arrays.toString(arrayStudent));

        // d.  	Declare an array for a table with 6 rows 2 columns
        // that used to store integer value.
        int arrayTable[][] = new int[6][2]; //6 rows, 2 columns

        System.out.println("");
        //fill the array
        for(int indexRow =0; indexRow< arrayTable.length; indexRow++){
            Arrays.fill(arrayTable[indexRow],4);
            System.out.println(Arrays.toString(arrayTable[indexRow]));
        }
        System.out.println("");
        for (int[] row:arrayTable){
            Arrays.fill(row,4);
            System.out.println(Arrays.toString(row));
        }

        //display array
        System.out.println(Arrays.deepToString(arrayTable));

        // e. Initialize an array with the following value:
        // check https://docs.google.com/document/d/1Ssc39yJkyumNtvwgtNGkMfvBOcdV7HhneR7S5khkcMM/edit#
        int[][] numArray = {{6,9},{2,5},{4,6}};
        System.out.println();
        System.out.println(Arrays.deepToString(numArray));

        //f.	After initialize the array, modify the value of the above array to
        //numArray = {{6,9},{2,4},{3,7}};
        //identify the index
        numArray[1][1] = 4;
        numArray[2][0] = 3;
        numArray[2][1] = 7;

        System.out.println();
        //System.out.println(Arrays.deepToString(numArray)); //use deepToString if u have multiple row
        System.out.println(Arrays.toString(numArray[1])); //to only print that row

        //g.	Display all the values of an array name contact in separate lines.
        String arrayContact[] = {"name1", "name2", "name3", "name4"};
        //display arrays in seperate line

        System.out.println("Method 1: ");
        for(String elements: arrayContact){ //basically it will assign the first index to string "elements"
            System.out.println(elements);
        }
        System.out.println();
        System.out.println("method 2:");

        for(int i=0; i<arrayContact.length; i++){ //i is arrayIndex
            System.out.println(arrayContact[i]);
        }


    }


}
