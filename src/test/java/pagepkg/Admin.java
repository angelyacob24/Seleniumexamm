package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin {
	WebDriver driver;
	Select obj;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/svg") WebElement admin;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div") WebElement userrole;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]") WebElement searchbtn;
	
	public Admin(WebDriver driver) {  // constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void navigatemthd()
	{
		
		admin.click();
		userrole.click();
		obj=new Select(userrole);
		obj.selectByVisibleText("Admin");
		searchbtn.click();
	}

}
