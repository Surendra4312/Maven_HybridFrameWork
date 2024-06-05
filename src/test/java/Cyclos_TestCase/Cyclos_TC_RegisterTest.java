package Cyclos_TestCase;

import org.testng.annotations.Test;

public class Cyclos_TC_RegisterTest extends Cyclos_BaseClass{
	@Test
	public void Cyclos_Register() {
		DemoCyclos.Cyclos_Register cr=new DemoCyclos.Cyclos_Register(driver);
		cr.clickRegister();
		cr.setname("surendra");
		cr.setLoginName("surendrakuamar");
		cr.setEmail("surendhrakumar4312@gmail.com");
		cr.setMobilephone("6301159071");
		cr.setLandlinephone("630-115-9071");
		cr.clickNext();
		cr.setPassword("kumar@123");
		cr.setPassword("kumar@123");
		cr.clickSubmit();
	}
}
