package Docker.SampleDocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class myChrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
DesiredCapabilities dc =DesiredCapabilities.chrome();

URL url=new URL("http://192.168.99.100:4444/wd/hub");

RemoteWebDriver driver=new RemoteWebDriver(url, dc);

driver.get("https://www.facebook.com/");

System.out.println(driver.getTitle());

driver.quit();

	}

 //	Reference:
	//URL---->https://www.youtube.com/watch?v=UzwnM13Na8E&list=PLUDwpEzHYYLtpm24ojHwubwmMNQildHBc&index=5
}
