import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //1st way to handle alerts

       WebElement e=driver.findElement(By.xpath("//input[@id='alertbtn']"));
        e.click();
      /*  Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        //O/P  Hello , share this practice page and share your knowledge */

        //2nd way to handle alert
try{
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.alert=function(){};");

} catch (Exception ex) {
    throw new RuntimeException(ex);
}





    }
}
