package Test1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Proje  extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement signup=driver.findElement(By.xpath("//*[@href='/UserRegister/NewUser']"));
        signup.click();



    }


}
