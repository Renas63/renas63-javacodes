package selenium.testng;

import org.testng.annotations.Test;

public class TestAnnotation2 {
    @Test(expectedExceptions = RuntimeException.class)
    public void task6() {
        System.out.println("test 6");
        //throw  new RuntimeException();// after throwing an exception, the test will be passed
    }
    @Test(dependsOnMethods = "task6")// since the task6 will fail, task7 will be failed bc task 7 is depends on task6
    public void task7() {
        System.out.println("Test 7");
    }

}
