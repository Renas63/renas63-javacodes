package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws  FileNotFoundException, InterruptedException {

        int num= Integer.parseInt("12");
        FileInputStream file = null;
        System.out.println(System.getProperty("user.dir"));
        // it will show current Java project location

        try {
            file = new FileInputStream("Text.txt");// if we change our file name, it will throw an exception.
            Scanner scanner= new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            int computerPrice=500;
            int myBudget=300;
            if(myBudget<computerPrice){
                throw new NullPointerException();
            }

            Thread.sleep(10000);
            System.out.println("Test");


        }catch (FileNotFoundException io){
            System.out.println("IO Exception");
        }

    }
}
