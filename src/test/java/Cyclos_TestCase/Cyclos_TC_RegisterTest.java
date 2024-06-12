package Cyclos_TestCase;

import org.testng.annotations.Test;

import Cyclos_PageObject.Cyclos_RegisterPage;

public class Cyclos_TC_RegisterTest extends Cyclos_BaseClass{
	@Test
	public void Cyclos_Register() throws InterruptedException {
		Cyclos_RegisterPage cr=new Cyclos_RegisterPage(driver);
		cr.clickRegister();
		cr.setname("surendra");
		cr.setLoginName("surendrakuamar");
		cr.setEmail("surendhrakumar4312@gmail.com");
		cr.setMobilephone("6305943725");
		cr.setLandlinephone("6305943725");
		cr.clickNext();
		cr.setPassword("kumar@123");
		cr.setPassword("kumar@123");
		cr.DemoCheckbox();
		Thread.sleep(20000);
		cr.clickSubmit();
	}
}
