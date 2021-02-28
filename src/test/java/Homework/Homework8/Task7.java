package Homework.Homework8;

public class Task7 {
    /*
    in my ventra card, I have an $36.
    Every usage of the ventra card is costing $3.
    Using while loop print how many times I have used the ventra card.
Example: Usage 1 Usage 2 Usage 3 ..
..
Usage 12 */
    public static void main(String[] args) {
        int cardBalance = 36;
        int count = 1;
        while (cardBalance > 0) {
            System.out.println("Usage " + count++);
            cardBalance -= 3;
            System.out.println(cardBalance);
            System.out.println(count);
        }
    }
}
