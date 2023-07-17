package StepsObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends LogInPage {

    WebDriver driver ;


    public LogInSteps(WebDriver driver1){

        driver= driver1;
    }
    public void signInBottom(){

        driver.findElement(signInBottom).click();
    }

    public void emailInput(String s){

        driver.findElement(emailField).sendKeys(s);
    }

    public  void passwordInput (String s){

        driver.findElement(passwordField).sendKeys(s);

    }
    public void logInBottom(){
        driver.findElement(loginBottom).click();

    }
    public void signInSubmit(){

        driver.findElement(signInSubmit).click();
    }
    public void forgotPasswordBottom(){

        driver.findElement(forgotPassword).click();
    }
    public void rememberMeBox(){

        driver.findElement(rememberMe).click();
    }
    public void searchFields(String s){
        driver.findElement(searchField).sendKeys(s);

    }

    public void searchBottom(){

        driver.findElement(searchBottom).click();
    }
    public void crateAccount(){

        driver.findElement(crateAccount).click();
    }
    public void nameInput(String s){

        driver.findElement(yourName).sendKeys(s);

    }
    public void emailInputAccount(String s){

        driver.findElement(mobileEmail).sendKeys(s);
    }
    public void passwordInPuAccount(String s){

        driver.findElement(passwordField).sendKeys(s);
    }

    public void rePassword(String s){

        driver.findElement(rePassword).sendKeys(s);
    }
    public void continiue(){

        driver.findElement(continueBottom).click();

    }
    public void mascaraIt() {


        driver.findElement(mascara).click();
    }



    public void radioBottom(){

        driver.findElement(radioBottom).click();

    }

    public void addBottom(){

        driver.findElement(addBottom).click();
    }
public void dropBox(){

        driver.findElement(dropBox).click();
}
public void quantity(){
        driver.findElement(quantity).click();


}
public void cardBottom(){

        driver.findElement(cardBottom).click();
}
public void deleteBottom(){
        driver.findElement(deleteBottom).click();


}
}
