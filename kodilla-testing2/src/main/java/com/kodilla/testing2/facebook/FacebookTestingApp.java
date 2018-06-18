package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String PREFIX = "//html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/form/div/";
    public static final String XPATH_INPUT = PREFIX + "div/div/div/div/div/input";
    public static final String XPATH_INPUT2= PREFIX + "div/div/div[2]/div/div/input";
    public static final String XPATH_INPUT3= PREFIX + "div[2]/div/div/input";
    public static final String XPATH_INPUT4 = PREFIX + "div[5]/div/div/input";
    public static final String XPATH_SELECT = PREFIX + "div[6]/div[2]/span/span/select";
    public static final String XPATH_SELECT2 = "html/body/div/div[3]/div/div/div/div/div/div/div/div/div/div/div/form//div[6]/div/span/span/select[2]";
    public static final String XPATH_SELECT3 = "html/body/div/div[3]/div/div/div/div/div/div/div/div/div/div/div/form//div[6]/div/span/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
        searchField.sendKeys("Jan");

        WebElement searchFiled2 = driver.findElement(By.xpath(XPATH_INPUT2));
        searchFiled2.sendKeys("Kowalski");

        WebElement searchField3 = driver.findElement(By.xpath(XPATH_INPUT3));
        searchField3.sendKeys("111222333");

        WebElement searchField4 = driver.findElement(By.xpath(XPATH_INPUT4));
        searchField4.sendKeys("razdwatrzy");

        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(7);

        while (!driver.findElement(By.xpath(XPATH_SELECT2)).isDisplayed());

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT2));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(6);

        while (!driver.findElement(By.xpath(XPATH_SELECT3)).isDisplayed());

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT3));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByIndex(1991);

    }
}
