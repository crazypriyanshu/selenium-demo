package org.pdas.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // locators
    private By header = By.id("masthead");
    private By title = By.className("home-link");
    private By signUpButton = By.className("actnbr-button-wrap");
    private By menuDropdown = By.id("navbar");
    private By searchButton = By.xpath("//*[@class=\"search-field\"]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(1L));
    }

    public void goToHeader() {
        WebElement headerElem = driver.findElement(header);
        String role = headerElem.getAttribute("role").toLowerCase();
        System.out.println(role);
    }

    public void clickOnSearch() throws InterruptedException {
        WebElement searchButtn = driver.findElement(searchButton);
        searchButtn.click();

        searchButtn.sendKeys("Search");
        driver.wait(1000);
    }

    public void iShouldSeeHeader() throws InterruptedException {
        WebElement menuI = driver.findElement(menuDropdown);
        menuI.click();
        driver.wait(1000);
    }
}
