package RecapAndMentoring;



public class PrintLetter {
    public static void main(String[] args) {
        String word="Techtorial is a good school";
    int index=0;

        while(index<word.length()){
            System.out.println(word.charAt(index));
            index++;

        }
        System.out.println("*********************while option*********************");

        for(int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

        System.out.println("print from last char to first char");

        int indexNum=word.length()-1;
        while(indexNum>=0){
            System.out.println(word.charAt(indexNum));
            indexNum--;
        }
    }
}
