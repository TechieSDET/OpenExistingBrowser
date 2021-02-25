package ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AlreadyOpenedBrowserDebugger {

    public static void main(String args[]) {

            WebDriverManager.chromedriver().setup();
            ChromeOptions opt = new ChromeOptions();
            opt.setExperimentalOption("debuggerAddress","127.0.0.1:98765");
            WebDriver driver = new ChromeDriver(opt);
            try {
                driver.get("https://www.facebook.com/");
                driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
                driver.close();
            }catch (Exception e){
                e.printStackTrace();
                driver.close();
            }

    }


}
