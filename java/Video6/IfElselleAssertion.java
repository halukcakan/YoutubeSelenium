package Video6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IfElselleAssertion {

    static WebDriver driver;
    String aramaYaziElementi;


    @BeforeClass
    public static void setUo() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        driver.get("https:www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Nutella");

        aramaKutusu.submit();

        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));






    }


}
