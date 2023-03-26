package video8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClassApply {

    @Test
    public void  Test01(){
        //launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //navigate to '.....' url
        driver.get("http://automationexercise.com");

        //click 'sign up/login' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

        //enter name and email adres
        //click 'sign up' button
        WebElement nameBox = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        Actions action = new Actions(driver);
                action.click(nameBox)
                .sendKeys("Ahmet")
                .sendKeys(Keys.TAB)
                .sendKeys("asd@ads.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        //fill details
        //select checkbox : 'sign up for our newsletter
        //select chechbox : 'receive
        //fill details
        //click 'create accounts button'
        //verify that 'account created' is visible
    }
}
