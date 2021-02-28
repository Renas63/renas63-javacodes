package Objects;

public class Icloud {


        String userName;
       static String familyName="Hunt";// everyone has their own lastname but this family name is the same for everybody
        static int storage=2048;// GB Every object has only one storage and they are sharing the same storage

    public void store(int gb){
        storage-=gb;
        System.out.println("Current empty space is "+storage);


    }

}
