package Test1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje2 extends BaseDriver {
    @Test
    public void Test2() {
        driver.get("https://itera-qa.azurewebsites.net");
        WebElement login = driver.findElement(By.cssSelector("[href='/Login']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='Username']"));
        username.sendKeys("İsmetT123");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1234");
        WebElement buton = driver.findElement(By.xpath("//input[@name='login']"));
        buton.click();
        WebElement label = driver.findElement(By.cssSelector("[class='alert-danger']"));
        Assert.assertFalse(label.getText().equals("Wrong username or password"), "TEST FAILED");
        BekleKapat();





    }



}
