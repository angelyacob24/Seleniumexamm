package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Admin;
import pagepkg.Pageclass;




public class Baseclass {
	public static WebDriver driver;
	public Pageclass pageobj;
	public Admin adobj;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
      @BeforeMethod
	
	public void objectmethod()
	{
    	adobj=new Admin(driver);
		pageobj=new Pageclass(driver);
		
	}

}
