package RecapAndMentoring;

public class Hwk8T7 {
    public static void main(String[] args) {
        /*
    in my ventra card, I have an $36.
    Every usage of the ventra card is costing $3.
    Using while loop print how many times I have used the ventra card.
Example: Usage 1 Usage 2 Usage 3 ..
..
Usage 12 */
        int balance=36;
        int count=1;
        for (; balance>0; balance-=3) {
            System.out.println(balance);
            System.out.println("Usage" +count++);
        }
    }
}
