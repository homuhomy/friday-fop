package tutorial5;

//correct the following codes

public class Tutorial5Question2 {
    public static void main(String[] args) {
//        2.	Correct the error for the following statements.
// a.
        String[] code = {"AAA", "AAB", "AAC", "AAD"};

//        b.
//        int[] num = new num[10];
//        for(int k=0; k<=num.length(); k++)
//            sum+=num;

        //Remember index array start with 0
        //Index for array score: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        int sum = 0;
        int[] num = new int[10];

        for(int k=0; k<num.length; k++)  { //k is counter
            sum+= num[k];
            System.out.println(sum);
        }

//        c. I DONT UNDERSTAND
//
//        int [][]t = new int[3][]; //not sure how many column
//        t[1][2] = 5;

        int [][]t = new int[3][];
        t[1] = new int[3]; //add size of column to row 1
        t[1][2] = 5;
//
//
//        d.
//        int i=4;
//        int []score = new int[5]; //exceed
//        score [1] = 78;
//        score[++i] = 100; same as i = i+1 (i is 4 + 1 = 5)

        int i=4;
        int []score = new int[5];
        score [1] = 78;
        score[i] = 100;
        //Remember index array start with 0
        //Index for array score: 0, 1, 2, 3, 4


    }
}
