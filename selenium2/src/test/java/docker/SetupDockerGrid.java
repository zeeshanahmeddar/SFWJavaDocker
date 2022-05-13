package docker;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SetupDockerGrid {
	@BeforeSuite
	void startDockerGrid() {
		try {
			Runtime.getRuntime().exec("cmd /c start start_docker.bat");
			Thread.sleep(20000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	void stopDockerGrid() {
		try {
			Runtime.getRuntime().exec("cmd /c start stop_docker.bat");
			Thread.sleep(20000);
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
				
	}
}
