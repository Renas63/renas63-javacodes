package ArrayConcept;

public class FilipDimArray {
    public static void main(String[] args) {
        int [][] image={{1,1,0,0},{0,1,0,1},{1,1,1,1},{0,0,1,1}};

        for (int i = 0; i < image.length/2; i++) {
            int[] temp= image[i];
            image[i]=image[image.length-i-1];
            image[image.length-i-1]= temp;

        }
        for(int []arr:image){

            for(int value:arr){

                System.out.print(value+ "-");
            }
            System.out.println();
        }

    }
}
