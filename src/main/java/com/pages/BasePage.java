package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected  void set(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected  void click(By locator){
        find(locator).click();
    }

    protected  void submit(By locator){
        find(locator).submit();
    }
}
