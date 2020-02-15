package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR_DAY = "//select[1]";
    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";

    public static final String XPATH_SELECT_DAY = "//div[contains(@class,\"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class,\"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class,\"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com");

        while (!webDriver.findElement(By.xpath(XPATH_WAIT_FOR_DAY)).isDisplayed()) ;
        WebElement selectComboDay = webDriver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(19);

        while (!webDriver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed()) ;
        WebElement selectComboMonth = webDriver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(11);

        while (!webDriver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed()) ;
        WebElement selectComboYear = webDriver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(39);
    }
}
