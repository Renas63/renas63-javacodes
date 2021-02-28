package Everest;

public class Task3 {
    public static void main(String[] args) {

       float money =4.56f;
       int balance= (int)(money*100);// 236%25=11
        System.out.println(balance);
      int  q,d,n,p;

      q=balance/25;
        System.out.println(q);
        balance=balance%25; //11%10=1
        d=balance/10; // 1
        System.out.println(d);
        balance=balance%10; //1
        n=balance/5; //0
        System.out.println(n);
        balance=balance%5;// 1
        p=balance/1; //1
        System.out.println(p);





    }
}
