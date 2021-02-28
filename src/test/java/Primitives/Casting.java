package Primitives;

public class Casting {
    public static void main(String[] args) {

        int num=100;
        byte num1=(byte)num;// explicit  casting

        System.out.println(num1);


      short sh=50;
      byte by=66;
      by=(byte)(by+sh);// we need to use parenthesis to get int result then get the result

        System.out.println(by);

        float fl=89.87f;
        double db=12.34;

        fl= (float)(fl+db);
        // in the beginning of the assignment we aee providing data type which we want to cast


            int number=123;
            long ln=54;
            // number=(int)(number+ln);

            number+=ln; // number=number+ln;

        System.out.println(number);




    }
}
