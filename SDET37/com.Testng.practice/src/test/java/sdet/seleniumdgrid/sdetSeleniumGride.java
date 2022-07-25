package sdet.seleniumdgrid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sdetSeleniumGride {

	public static void main(String[] args) throws Throwable {
		//step 1:load the url
		URL url = new URL("http://localhost:4444/wd/hub");
		//step2: set capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		
		//step 3:load remote webdriver
		RemoteWebDriver driver = new RemoteWebDriver(url,capabilities);
		//step 4:load the app
		driver.get("https://gmail.com");
		
	}

}
