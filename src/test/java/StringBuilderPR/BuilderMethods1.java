package StringBuilderPR;

public class BuilderMethods1 {
    public static void main(String[] args) {
        StringBuilder test1 = new StringBuilder("2021").append(" new year");
        StringBuilder test2 = test1.append(" started ");
        test2.append(" today");
        System.out.println(test1);  // both test1 and test2 pointing the same object we have only 1 object.
                                    // so print will be the same.
        System.out.println(test2);

        StringBuilder builder = new StringBuilder("Toyota");
        System.out.println(builder.charAt(2)); // will print 'y' same as String method charAt

        //System.out.println(builder.charAt(20)); // StringOutFoBoundry

        System.out.println(builder.indexOf("o")); // will find the first matching element
        System.out.println(builder.indexOf("o", 2)); // indexOf O'i index number 2 den baslayarak ara
        System.out.println(builder.indexOf("ta"));
        System.out.println(builder.indexOf("tat")); // -1 since we don't have "tat"
        System.out.println(builder.indexOf("k")); // -1, since we don't have "k"
        System.out.println(builder.length());
        System.out.println(builder.substring(3));
        System.out.println(builder);
        System.out.println(builder.substring(2, 5));
        System.out.println(builder);
        builder.insert(2, '-'); // we don't have this method in String but we have in StringBuilder
        System.out.println(builder);
        builder.insert(5, ".-");
        System.out.println(builder);
        StringBuilder bl = new StringBuilder();
        bl.append("preparation");
        bl.insert(0, "$");
        bl.insert(11, "$");
        bl.insert(3, "-");
        System.out.println(bl);
        bl.delete(bl.length() - 2, bl.length()); // everytime deletes last 2 char starting from last 2 until the end
        System.out.println(bl);
        bl.deleteCharAt(bl.indexOf("-")); // "-" i ordan cikar. Hangi index num da oldugunu  bilmedigimizden indexOf kullandik
        System.out.println(bl);
        //Task: Create method that will accept the string as a parameter and it will remove all the "-" and print it.
        // exp: pre--pa-ra-ti-on-->preparation
        nohypen("p--on-yu-iu");
    }
    public static void nohypen(String str){
        StringBuilder bl=new StringBuilder(str); // String object is converted to the StringBuilder so that we can use delete method.
        for (int i = 0; i < bl.length()-1; i++) {
            if(bl.charAt(i)=='-'){    // primitives so that we use '=='
                bl.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(bl);
    }
}


