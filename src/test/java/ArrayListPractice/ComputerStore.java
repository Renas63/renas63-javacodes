package ArrayListPractice;

import java.util.ArrayList;

public class ComputerStore {
    public static void main(String[] args) {
    Computer computer1= new Computer("Apple","Macbook", 0, 13d);
        Computer computer2= new Computer("Apple","Macbook", 2000, 16d);
        Computer computer3= new Computer("Dell","XPS", 1200, 13d);
        Computer computer4= new Computer("HP","Envy", 1000, 15d);
        Computer computer5= new Computer("Asus","Asus16", 1600, 15d);
        Computer computer6= new Computer("Apple","Macbook", 1350, 13d);
        Computer computer7= new Computer("Lenova","ThinkPad", 2000, 16d);


        ArrayList<Computer> computers= new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);

        Computer computerCheapest= computers.get(0);

        for (int i = 1; i < computers.size(); i++) {
            if(computers.get(i).price()<computerCheapest.price()){
                computerCheapest=computers.get(i);
            }

        }
        System.out.println(computerCheapest.toString());
        // I need computer from Apple
        System.out.println("The cheapest computer is : ");
        for (int i = 0; i <computers.size() ; i++) {
            if (computers.get(i).equals("Apple")) {
                System.out.println(computers.get(i));
            }
        }

            // I need computer which price is in the range of 500-1300
            System.out.println("The computer is in range of $500- $1300: ");
            for (int j = 0; j < computers.size(); j++) {
                if(computers.get(j).price()>500 && computers.get(j).price<1300){
                    System.out.println(computers.get(j));
                }

            }
        }

}
