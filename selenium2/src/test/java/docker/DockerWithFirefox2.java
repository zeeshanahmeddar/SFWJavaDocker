package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerWithFirefox2 {

	@Test
	public void testf2() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		URL url = null;
		try {
			url = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of page f2 "+driver.getTitle());
		driver.quit();
	}
	

}
