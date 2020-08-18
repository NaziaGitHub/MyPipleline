package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.*;

public class Class1 
{
	public static final String USERNAME = "fahad_123";
	  public static final String ACCESS_KEY = "83dc815f-1517-439d-961b-02cb808c2a09";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	  public static void main(String[] args) throws Exception {
	  
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Linux");
	    caps.setCapability("version", "latest");
	  
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://www.amarujala.com");
	    //driver.findElement(By.id("email")).sendKeys("warisha@net.com");
	    //driver.findElement(By.id("pass")).sendKeys("medicine");
	    //driver.findElement(By.xpath("//input[contains(@id,'u_0_')]")).click();
	  }
	

}
