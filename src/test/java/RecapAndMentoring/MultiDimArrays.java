package RecapAndMentoring;

public class MultiDimArrays {
    public static void main(String[] args) {
String [][] names= new String[3][3];

        names[0][0]="Ela";
        names[0][1]="Aya";
        names[0][2]="Enes";
        names[1][0]="Ramis";
        names[1][1]="Ahmed";
        names[1][2]="Ayhan";
        names[2][0]="Cem";
        names[2][1]="Mehmet";


        System.out.println("Number of rows: "+names.length);
        System.out.println("Number of colums: "+names[0].length);

        for (int i = 0; i < names.length ; i++) {
            for (int j = 0; j < names[i].length ; j++) {

                System.out.println(names[i][j]);
            }

        }
    }
}
