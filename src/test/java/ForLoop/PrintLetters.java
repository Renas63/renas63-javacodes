package ForLoop;



public class PrintLetters {
    public static void main(String[] args) {
        String str = "For Loop practise class";
        // print the numbers between 0 to length of the string
        // print all the letter from this string using for loop
        // print only the char which is 'o'


        for (int i = 0; i < str.length(); i++) {

            System.out.println(i); // it will give index of string TASK1

            if (str.charAt(i) == 'o') {

               // System.out.println(str.charAt(i));// print only 'o char TASK 3
            }
            //System.out.println(str.charAt(i));// print out all string TASK 2

        }

        //for (int j=length-1; j>0; j-- ){   //?????? reverseeeee
          //  System.out.println(str.charAt(j));
        String word="Indiana University";
        int k=0;
        while(k<word.length()){
            //System.out.println(k);
            System.out.println(word.charAt(k));

            k++;

        }
        }

    }

