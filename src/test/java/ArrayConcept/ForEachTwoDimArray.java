package ArrayConcept;

public class ForEachTwoDimArray {
    public static void main(String[] args) {
        String products[][] = new String[3][3];

        String[][] black = {{"Apple", "Microsoft", "Google"},
                {"Apple", "Samsung", "Huawei"},
                {"Boss", "LG", "Beats"}};
// print the product name if it s equals to Apple, using For each loop

        for (String[] blue : black) { // outer box

            for (String star : blue) { // blue is inner box
                if (star.equals("Apple")) { // stars are inside the blue bax.
                    System.out.println(star);
                }
            }

        }
    }
}