package selenium.properties;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesIntro {

    @Test
    public void testProperties() throws IOException {
       File propertiesFile= new File("src/test/resources/configurations.properties");
        Properties properties= new Properties();
        properties.load(new FileInputStream(propertiesFile));

        String url= properties.getProperty("url");
        System.out.println(url);

        String username= properties.getProperty("username");
        System.out.println(username);

        String password= properties.getProperty("password");
        System.out.println(password);
    }
    @Test
    public void testProperties2() throws IOException {
        File propertiesFile= new File("src/test/resources/credentials.properties");
        Properties properties= new Properties();
        properties.load(new FileInputStream(propertiesFile));

        String env= properties.getProperty("browser","chrome");
        System.out.println(env);

        String environment= properties.getProperty("environment");
        System.out.println(environment);

        String username= properties.getProperty("username");
        System.out.println(username);

        String password= properties.getProperty("password");
        System.out.println(password);
    }
}
