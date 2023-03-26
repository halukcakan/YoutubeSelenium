package video7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_JunitAssertoin {



    @Test
    public void test01 () throws InterruptedException {
        // launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //navigate to url '...'
        driver.get("http://automationexercise.com");

        //verify that home page is visible successfully
        WebElement logoElementi = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElementi.isDisplayed());

        //click on 'product button'
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();

        driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
        driver.switchTo().parentFrame();


        /*
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"ad_iframe\"]")));

        driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();

        driver.switchTo().parentFrame();
        */




        //verify user is navigated to all products page successfully
        String expectedUrl = "https://automationexercise.com/products";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        // enter product name in search input and click search button
        WebElement productInputSearch = driver.findElement(By.xpath("//*[@id=\"search_product\"]"));

        productInputSearch.sendKeys("tshirt");
        driver.findElement(By.xpath("//*[@id=\"submit_search\"]")).click();

        //verify 'search product' is visible
        WebElement result = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
        Assert.assertTrue(result.isDisplayed());

        //close driver
        driver.close();






    }
}
