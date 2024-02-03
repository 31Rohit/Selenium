import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
 @Test
   static void Setup(){
     System.setProperty("webDriver.chrome.driver","src/test/resources/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("scrollBy(0,1000)");
 }

    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       WebElement firstName= driver.findElement(By.id("RESULT_TextField-1"));
       firstName.sendKeys("FirstName");
       driver.findElement(By.name("RESULT_TextField-2")).sendKeys("LastName");
       driver.findElement(By.xpath("//input[@value=Submit]")).click();

    }
}
