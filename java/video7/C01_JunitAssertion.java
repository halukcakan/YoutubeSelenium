package video7;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_JunitAssertion {
    @Test
    public void test01(){

        // launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // navigate to url ...
        driver.get("http://automationexercise.com");

        //varify thay home page is visible successfully
        WebElement logoElementi = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElementi.isDisplayed());

        //click on 'sing up/login button'
        WebElement signUpLink = driver.findElement(By.xpath("//a[@href='/login']"));
        signUpLink.click();

        //verify 'login to your account' is visible
        WebElement loginAccountText  = driver.findElement(By.xpath("//div[h2='Login to your account']"));
        Assert.assertTrue(loginAccountText.isDisplayed());

        //enter correct email address and password
        WebElement mailAddressBox = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
        mailAddressBox.sendKeys("ahmet@nehaber.com");
        WebElement passwordAddressBox = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
        passwordAddressBox.sendKeys("12345");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        //verify that 'logged in as username' is visible
        WebElement loggedInText = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        Assert.assertTrue(loggedInText.isDisplayed());

        //click 'logout' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

        //verify that user is navigate to login page
        String expectedUrl = "https://automationexercise.com/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //close driver
        driver.close();



    }
}
