import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alert2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //1st way to handle alerts

        WebElement e=driver.findElement(By.xpath("//input[@id='alertbtn']"));
        e.click();

        WebDriverWait wait=new WebDriverWait(driver,
                Duration.ofSeconds(30));
        Alert al=wait.until(ExpectedConditions.alertIsPresent());
        al.accept();


    }
}
