package Objects;

public class VarArgsPractice {
    public int sum( int... numbers){
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }

    // CREATE one name method to provide a name which given in the with following format
    // 1.David
    //2.Marcus
    //Ali

    public void name(String...names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "." + names[i]);
        }
    }

    public static void main(String[] args) {
        VarArgsPractice var= new VarArgsPractice();

        int result= var.sum(4,5,10,11,13);
        System.out.println(result);

        var.name("David", "Marcus", "Ali");

    }
}
