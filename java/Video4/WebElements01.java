package Video4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Nutella");

        aramaKutusu.submit();

        WebElement sonucYaziElementi = driver.findElement(By.xpath("a-section a-spacing-small a-spacing-top-small"));
        System.out.println(sonucYaziElementi.getText());

        driver.close();



    }
}
