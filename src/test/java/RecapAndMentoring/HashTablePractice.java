package RecapAndMentoring;



import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTablePractice {
    public static void main(String[] args) {

        Hashtable<String, Double> stock= new Hashtable<>();
        stock.put("Apple", 130.5);
        stock.put("tesla", 830.5);
        stock.put("Plug", 70.9);
        stock.put("Nio", 63.0);
        Set<Map.Entry<String, Double>> result= stock.entrySet();
        for (Map.Entry<String, Double> print:result){
            System.out.println(print.getKey());
            System.out.println(print.getValue());
        }


    }
}
