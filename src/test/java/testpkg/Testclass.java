package testpkg;

import org.testng.annotations.Test;

import base.Baseclass;

public class Testclass extends Baseclass {
	@Test
	public void loginvalidationmthd()
	{
		pageobj.loginmthd("Admin","admin123");
		
		
	}
	

}
