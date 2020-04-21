import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users/haydenbdennis/Desktop/02_Dev_Projects/Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertbutton = driver.findElement(By.id("alert-button"));
        alertbutton.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        driver.quit();
    }
}
