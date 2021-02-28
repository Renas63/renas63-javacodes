package Homework.Homework1;

import java.util.Scanner;

public class TaskFourDigits {
    public static void main(String[] args) {


        int digit= 327695;
        int num1= digit%10; //5
         digit=digit/10;  //32769
         int num2 = digit%10; //9
         digit=digit/10; // 3276
         int num3= digit%10; // 6
         digit=digit/10; // 327
         int num4=digit%10; // 7
         digit=digit/10; //32
         int num5=digit%10; //2
         digit=digit/10; //3
         int num6=digit%10; //3
         digit=digit/10;

         int multiplication= num1*num2*num3*num4*num5*num6;
      System.out.println(multiplication);

        System.out.println(+num1+num2+num3+num4+num5+num6);


    }

    public static class Homework7Task1 {
        public static void main(String[] args) {
            /*
            Using scanner ask user to enter to String value
             and concatenate them together then print the result.
             If both String length is not same then
             omit chars from the longer string so
             it is the same length as the shorter string.
              After making both string same length then concatenate it.
              EXAMPLE-1: String 1: "Cell" String 2: "Phone" Output: "CellPhon"
             EXAMPLE-2: String 1: "Cable" String 2: "Mic" Output: "CabMic"
             */

            Scanner input= new Scanner(System.in);
            System.out.println("Please enter first word");
            String word1=input.nextLine();
            System.out.println("Please enter second word");
            String word2=input.nextLine();
            int word1Length=word1.length();
            int word2Length= word2.length();

            if(word1Length==word2Length)
            {
                System.out.println(word1.concat(word2));

            } else if(word2Length>word1Length){
                String newWord=word1.concat(word2.substring(0,word1Length));
                System.out.println(newWord);
                //ayhan+mehme
            }else{ //word1length>word2Length
                String newWord=word1.substring(0,word2Length).concat(word2);
                System.out.println(newWord);
            }




        }

    }
}
