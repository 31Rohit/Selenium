import io.github.bonigarcia.wdm.WebDriverManager;
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
     driver.get("https://abhishekyadav4.github.io/logInForm-react/");
     driver.findElement(By.name("username")).sendKeys("standerd_user");
     driver.findElement(By.name("email")).sendKeys("r.grohitgupta1920@gmail.com");
     driver.findElement(By.name("password")).sendKeys("password");
     if(driver.findElement(By.tagName("button")).isEnabled()){
         System.out.println(("Yes is Displayed"));
     }
//     driver.close();
 }

    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       WebElement firstName= driver.findElement(By.id("RESULT_TextField-1"));
       firstName.sendKeys("FirstName");
       driver.findElement(By.name("RESULT_TextField-2")).sendKeys("LastName");
       WebElement phoneNumber=driver.findElement(By.id("RESULT_TextField-3"));
        if (phoneNumber.isDisplayed() && phoneNumber.isEnabled()) {

            phoneNumber.sendKeys("1234567890")  ;}
        else
            System.out.println("Phone number field is not visible or enabled.");
        WebElement cityField = driver.findElement(By.id("cityInput"));
        WebElement emailField = driver.findElement(By.id("emailInput"));
        cityField.sendKeys("SampleCity");
        emailField.sendKeys("sample@email.com");

        WebElement fileInput = driver.findElement(By.id("fileInput"));
        String filePath = "path/to/your/file.txt";
        fileInput.sendKeys(filePath);
       driver.findElement(By.xpath("//input[@value=Submit]")).click();

    }
}
