package OOP.Abstraction.Abstract;

public class SelfLearner extends  Student{
    public SelfLearner(){
        super("Self",22);
    }
    public void attend(){
        System.out.println("Self learner is started to learn");
    }
    public void speak(){
        System.out.println("Self learner is making practice");
    }
    public void learn(){
        System.out.println("Self learner finished the topic");

        //NOTE: First class that implements the abstract method
        // from abstract class is called concrete class.
    }
}
