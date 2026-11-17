package testpkg;

import org.testng.annotations.Test;

import base.Baseclass;
import pagepkg.Admin;
import pagepkg.Pageclass;

public class Admintest extends Baseclass {
	
	
	@Test
	public void Adminverify()
	{
		pageobj.loginmthd("Admin","admin123");
		adobj.navigatemthd();
		
	}
	
	

}
