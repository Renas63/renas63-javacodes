package StringBuilderPR;

public class Task1 {

    public static void deleteMiddle(StringBuilder[]names){
        for (int i = 0; i < names.length; i++) {
            if(names[i].length()%2==1){
                names[i].replace(names[i].length()/2,names[i].length()/2+1,"$");
                System.out.println(names[i]);
            }

        }
    }
    public static void main(String[] args) {
        StringBuilder [] names={new StringBuilder("David"), new StringBuilder("Kushal"),new StringBuilder("Renas")
        , new StringBuilder("Muammer")};
        // create one method will accept the StringBuilder array and replace middle char with '$'
        // from every name which length is odd number
        deleteMiddle(names);


    }
}
