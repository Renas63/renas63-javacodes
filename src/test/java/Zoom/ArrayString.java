package Zoom;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        /*
        using Scanner as user to enter element number of the string array
        using scanner ask user each element of the array
        if the length of element bigger than 5 then assign it inside the array
        if not assign " invalid entry"
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a size of array: ");
       int size= input.nextInt();
       String array[]= new String[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println(" Please enter " +i+ ".element: ");
            String name=input.next();

            if(name.length()>5){
                array[i]=name;

            }else
                array[i]="Invalid Entry";

        }
        System.out.println(Arrays.toString(array));
    }
}
