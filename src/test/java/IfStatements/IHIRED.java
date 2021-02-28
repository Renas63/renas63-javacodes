package IfStatements;

import java.util.Scanner;

public class IHIRED {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Do you know Java?");

        String java= input.next();

        if(java.equals("yes")){
            System.out.println(" Do you know Selenium?");
            String selenium = input.next();
            if (selenium.equals("yes")) {
                System.out.println(" do you know Api testing");
                String api = input.next();
                if (api.equals("yes")) {
                    System.out.println("we require Api testing");
                    String sql = input.next();
                    if (sql.equals("yes")) {
                        System.out.println(" you are hired");
                    } else {
                        System.out.println("we require sql");
                    }

                }else{
                    System.out.println("we also require a Api");
                }
            } else {
                System.out.println("We require selenium");
            }
        }else{
            System.out.println(" we require java");
        }
}

    }
