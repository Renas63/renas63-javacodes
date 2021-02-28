package WhileLoop;

import java.util.Scanner;

public class TechtorialWhileLoop {
    public static void main(String[] args) {
       /*
       TASK:
Print all the letters from given string using while loop
String str= "TECHTORIAL";
str.chartAt(0);
str.chartAt(1);
str.chartAt(2);
str.chartAt(4);
....
str charAt(str.length()-1)
        */
    // while index is less than last index number run the while loop
        // and us this index number to print the letters inside the loop
        Scanner input= new Scanner(System.in);
        System.out.println(" please enter a string");
        String name= input.nextLine();

        int index=0;
        while(index<name.length()){
            System.out.println(name.charAt(index));
            index++;
        }
       // interview question
      //       char lastChar=name.charAt(name.length()-1);
       // System.out.println(name);    IT WILL PRINT LAST CHAR


        System.out.println("Last char to first char");
        int index2=name.length()-1;    //9
        while(index2>=0){
            System.out.println(name.charAt(index2));// INTERVIEW QUESTION!!!!!!!!!!!!!!!!!!!!!
            index2--;
        }

    }

}
