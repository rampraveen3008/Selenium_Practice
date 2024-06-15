package utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverManager {

    public WebDriver driver; //null //knowledge
    public WebDriver getDriverDetails() throws IOException {

        if (driver == null) {

            File f = new File("src/main/resources/Configurations/FrameworkConfig.properties");
            FileInputStream fis = new FileInputStream(f);
            Properties prop = new Properties();
            prop.load(fis);

            switch (prop.getProperty("browser").toLowerCase()) {
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new InvalidArgumentException("Enter the valid browser name");
            }
//            driver = new ChromeDriver();
            driver.get(prop.getProperty("testenvironement"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }
        return driver;

    }
}
