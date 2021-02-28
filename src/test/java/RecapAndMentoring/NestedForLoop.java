package RecapAndMentoring;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i ++) {
            System.out.println("Baby Jo");
        }
        System.out.println(".................");


        String[] colors = {"red", "blue", "green"};
        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);

        }
        System.out.println(".................");

        String[][] fancyColors = { {"red", "blue", "green"},
                                   {"black", "orange", "pink"}
        };
          for (int row=0; row<2;row++){
              for(int column=0; column<3; column++){
                  System.out.println(fancyColors[row][column]);
              }
          }
    }
}


