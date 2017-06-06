import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mengqingzhu on 6/6/17.
 */
public class GoogleDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();



    }
}
