package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class ChromeRunner {


    public static WebDriver driver = new ChromeDriver();


    @BeforeMethod

    public void openChrome() {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().deleteAllCookies();
    }


    @AfterTest
    public void closeChrome(){

        driver.quit();
    }

}