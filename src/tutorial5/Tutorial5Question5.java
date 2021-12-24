package tutorial5;

//Write the statements that display the string array name sentence in reverse order.
// Each string element must be displayed in reverse order as well.

public class Tutorial5Question5 {
    public static void main(String[] args) {

        String sentence[] = {"Write", "the", "statements", "that", "display"};

        //sentence.length-1 find highest index
        for (int words = sentence.length-1; words >= 0; words--){
            for (int character = sentence[words].length()-1; character>=0; character--){
                System.out.print(sentence[words].charAt(character));
            }
            System.out.println();
        }
    }
}
