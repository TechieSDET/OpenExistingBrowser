<h2>Run selenium script in existing browser</h2>
<h4> 
  1. Launch browser Manaully.</br>
  </br>
  2. Launch browser through automation script.
</h4>

<h5>Type 1. Launch browser Manaully.</h5>
<p>To enable Chrome to open a port for remote debugging, we need to launch it with a custom flag</p>
<p>For windows:</p>
<pre>
chrome.exe --remote-debugging-port=9222 --user-data-dir="any local folder"
</pre>

<p>For Mac:</p>
<pre>
Google\Chrome --remote-debugging-port=9222 --user-data-dir="~/ChromeProfile"
</pre>

<h5>Type 2. Launch browser through automation script.</h5>

<pre>
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

</pre>
