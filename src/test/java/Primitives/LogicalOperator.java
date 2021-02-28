package Primitives;

public class LogicalOperator {
    public static void main(String[] args) {
        int number= 8;

        boolean result= ++number - --number >= 1 && number--<10;

        // true && true
        System.out.println(number); // 7
        System.out.println(result); //true

        long pages=123;
        boolean $result=pages-- +pages <130 | pages++ + --pages !=123;

        //result = 123+122 <130 (false)  | true
        // pages 122
        System.out.println(pages);
        System.out.println($result);

    }
}
