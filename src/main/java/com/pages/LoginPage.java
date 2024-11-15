package com.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("UserName");
    private By passwordField = By.id("Password");
    private By loginButton = By.id("loginIn");
    private By loginLink = By.id("loginLink");


    public void setUsername(){
        set(usernameField , "admin");
    }

    public void setPassword(){
        set(passwordField, "password");
    }

    public void clickLogin(){
        submit(loginButton);
    }

    public void clickLoginLink(){
        click(loginLink);
    }
}
