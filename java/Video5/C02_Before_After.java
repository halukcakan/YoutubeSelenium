package Video5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Before_After {

    WebDriver driver;


    @Before
    public void setUo (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown (){
        driver.close ();
    }

    @Test
    public void test01 (){
        driver.get("https:www.amazon.com");
    }

    @Test
    public void test02 (){
        driver.get("https:www.facebook.com");
    }

    @Test
    public void test03 (){
        driver.get("https:www.twitter.com");
    }

}
