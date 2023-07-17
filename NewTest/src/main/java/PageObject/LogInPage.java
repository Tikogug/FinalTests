package PageObject;

import org.openqa.selenium.By;

public class LogInPage {

    protected By
     signInBottom = By.id("nav-link-accountList-nav-line-1"),
    emailField = By.id("ap_email"),
    passwordField=By.id("ap_password"),
    loginBottom = By.id("continue"),
    signInSubmit = By.id("signInSubmit"),
            forgotPassword=By.id("auth-fpp-link-bottom"),
            rememberMe= By.name("rememberMe"),
            searchField=By.id("twotabsearchtextbox"),
            searchBottom=By.id("nav-search-submit-button"),
            crateAccount=By.id("createAccountSubmit"),
            yourName=By.id("ap_customer_name"),
    mobileEmail=By.id("ap_email"),
    passwordFields=By.id("ap_password"),
    rePassword=By.id("ap_password_check"),

    continueBottom=By.id("continue"),
    mascara =By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div[2]/div[2]/h2/a/span"),
    radioBottom=By.xpath("//*[@id=\"newAccordionRow_1\"]/div/div[1]/i"),
    addBottom=By.id("add-to-cart-button"),
    dropBox=By.xpath("//*[@id=\"a-autoid-0-announce\"]"),
    quantity=By.id("quantity_2"),
    cardBottom=By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"),

    deleteBottom=By.xpath("//*[@id=\"sc-active-4763e3f0-b686-48c6-875a-3bbb6d61d851\"]/div[4]/div/div[2]/div[1]/span[2]/span/input");

}
