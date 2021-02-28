package NaveenAndSDET;

public class ArrayConcept {
    public static void main(String[] args) {
       // array: store similar data values in a array variable

    // 1. int array
        // lowest bound/index=0
        // highest bound / index=n-1(n i size of array)
        // one dimensional array

        // Disadvantage of array
        //1.size is fixed---> static array. To overcome this problem,
        //we use collection such as arraylist, hashtable---> use dynamic array
        // 2. stores only similar data type values. to overcome this problem,
        // we use Object array
        int i[]= new int[4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;
        System.out.println(i[2]);//30
        System.out.println(i[3]);// 40

        System.out.println("**********************************");
       // System.out.println(i[4]);// ArrayIndexoutOfBoundException
        System.out.println(i.length);// size of array --->4

        // print all the values of array:use for loop concept!
        for(int j=0; j<i.length;j++ ){
            System.out.println(i[j]);
        }
           // 2. Double Array
        double d[]=new double[3];
        d[0]=12.33;
        d[1]=13.44;
        d[2]=45.55;
        System.out.println(d[2]);// 45.55
        System.out.println("*************************");
        // char Array
        char c[]=new char[3];
        c[0]='a';
        c[1]='b';
        c[2]='c';
        System.out.println("**********************************");
        // 4. boolean array
        boolean b[]= new boolean[2];
        b[0]=true;
        b[1]=false;
        System.out.println("*******************************");
        //String array
        String s[]=new String[3];
        s[0]="test";
        s[1]="java";
        s[2]="World";

        System.out.println(s.length);
        System.out.println(s[1]);
        System.out.println("*************************************************");
        // Object array:(Object i a class)---< is used to store different  data  types values
        Object ob[]= new Object[6];
        ob[0]="Tom";
        ob[1]=25;
        ob[2]=12.33;
        ob[3]="1/1/1990";
        ob[4]='M';
        ob[5]="London";
        System.out.println(ob[5]);
        System.out.println(ob.length);//6

        for(int p=0;p< ob.length;p++){
            System.out.println(ob[p]);// print all values of Object array
        }







    }
}










