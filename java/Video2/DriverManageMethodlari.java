package Video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        System.out.println(driver.manage().window().getSize());     // (1051, 942) [pix]

        driver.manage().window().setPosition(new Point(100,100));

        driver.manage().window().setSize(new Dimension(600,900));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

}
