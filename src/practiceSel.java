import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceSel {

    public static void main(String[] args) {
test1();
    }
    public static void test1(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
     //   al.accept();


    }

}
