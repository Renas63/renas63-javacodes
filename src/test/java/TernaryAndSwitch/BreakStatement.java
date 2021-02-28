package TernaryAndSwitch;

public class BreakStatement {
    public static void main(String[] args) {

String roomName= "Room 1";

    switch(roomName){
        case "Room 1":
            System.out.println("Science");break;
        case "Room 2":
            System.out.println("Math");break;
        case "Room 3":
        System.out.println("Computer");break;

        default:
            System.out.println("there is no room!");
        }

    }
}
