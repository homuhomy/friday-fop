package tutorial5;

//Write the statements that display the number of
// occurrence of the word "the" (case sensitive) in a string array name sentence.

public class Tutorial5Question4 {
    public static void main(String[] args) {
        String sentence[] = {"the","Write", "The", "statements", "that", "display", "the", "number"};

        String search = "the";

        int count = 0;
        for (int i = 0; i< sentence.length ;i++ )
        {
            if(sentence[i].equals(search))
            {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();


//https://beginnersbook.com/2013/12/java-string-indexof-method-example/
/*        int indexOf(int ch): It returns the index of the first occurrence of character ch in a given String.

        int indexOf(int ch, int fromIndex): It returns the index of first occurrence
        of character ch in the given string after the specified index “fromIndex”. For example, if the indexOf() method is called like this str.indexOf(‘A’, 20) then it would start looking for the character ‘A’ in string str after the index 20.

        int indexOf(String str): Returns the index of string str in a particular String.

        int indexOf(String str, int fromIndex): Returns the index of string str in
        the given string after the specified index “fromIndex”.

        All the above variations returns -1 if the specified char/substring is not found in the particular String.*/

        int occurence = 0;
        for (String elements:sentence){
            if(elements.indexOf("the")!=-1){ //why -1 //basically if it's not "the" then it will returns -1

                occurence+=1;
            }
        }
        System.out.println("Total occurence of 'the' in array sentence is " + occurence);
    }
}
