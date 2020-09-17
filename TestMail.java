package ru.mail;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.util.concurrent.TimeUnit;

public class TestMail {

    @Test
    public void testMail() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.ru/");

        driver.findElement(By.id("mailbox:login-input")).sendKeys("luzhkov2605@mail.ru");
        driver.findElement(By.id("mailbox:submit-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("mailbox:password-input")).sendKeys("testMAIL2020");
        driver.findElement(By.id("mailbox:submit-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("compose-button__txt")).click();
        driver.findElement(By.className("container--zU301")).sendKeys("idedov@at-consulting.ru nbykanov@at-consulting.ru ");
        driver.findElement(By.xpath("(//div[@role])[1]")).sendKeys("sdfsdfsdfsdfsd");
        driver.findElement(By.className("(//span//span[@class='button2__txt'])[1]")).click();

        driver.quit();
    }
}
