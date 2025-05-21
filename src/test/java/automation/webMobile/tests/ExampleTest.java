package automation.webMobile.tests;

import automation.webMobile.drivers.DriverFactory;
import automation.webMobile.pages.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.createMobileDriver();
    }

    @Test
    public void abrirGoogleEnModoMovil() {
        driver.get("https://demoqa.com");

        System.out.println("Título: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement formsLabel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.GREAT_LABEL_FORMS)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", formsLabel);
        formsLabel.click();
        
        WebElement practiceForm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.PRACTICE_FORM_LABEL)));
        practiceForm.click();
        
        driver.findElement(By.xpath(Locators.USER_FIRST_NAME)).sendKeys("Pepito");
        driver.findElement(By.xpath(Locators.USER_LAST_NAME)).sendKeys("Grillo");
        driver.findElement(By.xpath(Locators.USER_EMAIL)).sendKeys("example@example.com");
        driver.findElement(By.xpath(Locators.USER_MOBILE_NUMBER)).sendKeys("6234578895");
        driver.findElement(By.xpath(Locators.USER_DATE_BIRTH)).sendKeys("11/11/2011", Keys.ESCAPE);
    }
        

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}