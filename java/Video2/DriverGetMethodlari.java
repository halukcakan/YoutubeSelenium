package Video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("sayfa title : "+driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        // driver.getPageSource();

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getWindowHandles());

        driver.close();

    }
}
