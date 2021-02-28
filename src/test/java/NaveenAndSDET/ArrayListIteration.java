package NaveenAndSDET;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries= new ArrayList<>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("Lost");
        tvSeries.add("Peaky Blinders");
        tvSeries.add(("Prison Break"));

        // 1. using Java 8 with for each loop and lambda expression
        System.out.println("****** print using for each with lambda in java 8");
        tvSeries.forEach(shows ->{
            System.out.println(shows);});

        System.out.println("*********print using Iterator***********");

        // 2. using iterator
        Iterator<String> it= tvSeries.iterator();
        while(it.hasNext()){
            String shows= it.next();
            System.out.println(shows);
        }
        System.out.println("******using lambda and forEachRemaining()  method");
        //3. using iterator and java 8 forEachRemaining() method
        it= tvSeries.iterator();
        it.forEachRemaining(shows->{
            System.out.println(shows);
        });

        //4. using simple for each loop
        System.out.println("******using basic for each loop  method");
        for(String show: tvSeries){
            System.out.println(show);
        }

        //5. using for loop
        System.out.println("******using basic for loop  method");
        for (int i = 0; i <tvSeries.size() ; i++) {
            System.out.println(tvSeries.get(i));
        }
        //6.using listIterator() to traverse in both directions
        System.out.println("****** print using listIteration() to traverse in both direction");
        ListIterator<String> tvSeriesListIterator= tvSeries.listIterator(tvSeries.size());
        while(tvSeriesListIterator.hasPrevious()){
          String show=  tvSeriesListIterator.previous();
            System.out.println(show);
        }
    }
    }

