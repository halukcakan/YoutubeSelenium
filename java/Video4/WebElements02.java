package Video4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        WebElement epostaKutusu = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
        epostaKutusu.sendKeys("kujyhtgrf");


        WebElement passKutusu = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
        passKutusu.sendKeys("ghjkl;");
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();


        WebElement sonucYazdirElementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));

        String expectedSonucYazisi ="Girdiğin şifre yanlış. Şifreni mi Unuttun?";
        String actualSonucYazisi = sonucYazdirElementi.getText();

        if (expectedSonucYazisi.equals(actualSonucYazisi)){
            System.out.println("Girilemdi testi passed");
        } else {
            System.out.println("Girilemdi testi failed");
        }

        driver.close();







    }
}
