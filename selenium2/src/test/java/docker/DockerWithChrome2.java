package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerWithChrome2 {
	//docker
	//snap info docker
	//sudo snap install docker
	//docker version
	//sudo chmod 666 /var/run/docker.sock
	//docker pull selenium/standalone-chrome:latest
	//docker images
	//docker ps
	//docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-chrome:latest
	//http://localhost:4444
	//docker stop containerID
	//docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-firefox:latest
	//http://localhost:4444
	//docker stop containerID
	
	//docker-compose up
	
	@Test
	public void testc2() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		URL url = null;
		try {
			url = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of page c2 "+driver.getTitle());
		driver.quit();
	}
	
}
