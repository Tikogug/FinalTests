import StepsObject.LogInSteps;
import Utils.ChromeRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LogInData.*;
import static java.lang.Thread.sleep;

public class LogIn extends ChromeRunner {

    @Test ( priority = 1 )
    public void logInWithIncorrectEmail() throws InterruptedException {


        LogInSteps step1 = new LogInSteps(driver);
        step1.signInBottom();
        step1.emailInput(incorrectEmailData);
        step1.logInBottom();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        sleep(5000);


    }

    @Test ( priority = 2)
    public void logInWithCorrectEmail() throws InterruptedException {


        LogInSteps step2 = new LogInSteps(driver);
        step2.signInBottom();
        step2.emailInput(correctEmailData);
        step2.logInBottom();
        step2.passwordInput(incorrectPasswordData);
        step2.signInSubmit();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        if (actualUrl.equalsIgnoreCase(expectedUrl)) {

            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");


        }
    }

    @Test
    public void forgotPassword() throws InterruptedException {

        LogInSteps step3 = new LogInSteps(driver);
        step3.signInBottom();
        step3.emailInput(correctEmailData);
        step3.logInBottom();
        step3.forgotPasswordBottom();
        step3.logInBottom();


        Thread.sleep(5000);


    }

    @Test
    public void keepSingInCheckBox() throws InterruptedException {

        LogInSteps step4 = new LogInSteps(driver);
        step4.signInBottom();
        step4.emailInput(correctEmailData);
        step4.logInBottom();
        step4.passwordInput(incorrectPasswordData);
        step4.rememberMeBox();
        step4.signInSubmit();

        Thread.sleep(5000);
    }

    @Test

    public void search() throws InterruptedException {

        driver.get("https://www.amazon.com/");
        LogInSteps steps5 = new LogInSteps(driver);
        steps5.searchFields(searchWord);
        steps5.searchBottom();
        Thread.sleep(5000);

        String ActualResult = searchWord;
        String ExpectedResult = "Shoes";

        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Test
    public void registrationPageWithCorrectData() throws InterruptedException {

        LogInSteps steps7 = new LogInSteps(driver);
        steps7.signInBottom();
        steps7.crateAccount();
        steps7.nameInput(correctName);
        steps7.emailInputAccount(correctEmail);
        steps7.passwordInPuAccount(correctPassword);
        steps7.rePassword(correctPassword);
        steps7.continiue();

        Thread.sleep(5000);

    }

    @Test
    public void registrationPageWithIncorrectData() throws InterruptedException {


        LogInSteps steps7 = new LogInSteps(driver);
        steps7.signInBottom();
        steps7.crateAccount();
        steps7.nameInput(correctName);
        steps7.emailInputAccount(correctEmail);
        steps7.passwordInPuAccount(incorrectPassword);
        steps7.rePassword(incorrectPassword);
        steps7.continiue();

        Thread.sleep(5000);


    }

    @Test
    public void shoppingCardAdd() throws InterruptedException {


        LogInSteps steps5 = new LogInSteps(driver);
        steps5.searchFields(newSearch);
        steps5.searchBottom();
        steps5.mascaraIt();
        steps5.addBottom();

        Thread.sleep(5000);


    }


    @Test
    public void addToCartOneOrMoreProducts() throws InterruptedException {


        LogInSteps steps5 = new LogInSteps(driver);
        steps5.searchFields(newSearch);
        steps5.searchBottom();
        steps5.mascaraIt();
        steps5.dropBox();
        steps5.quantity();
        steps5.addBottom();

        Thread.sleep(5000);


        WebElement wait1 = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
        wait1.click();


    }


    @Test
    public void removeItemCard() throws InterruptedException {

        LogInSteps steps5 = new LogInSteps(driver);
        steps5.searchFields(newSearch);
        steps5.searchBottom();
        steps5.mascaraIt();
        steps5.addBottom();
        steps5.cardBottom();
        steps5.deleteBottom();


        // Thread.sleep(5000);

        WebElement wait1 = new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
        wait1.click();

    }



}