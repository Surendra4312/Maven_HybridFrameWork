package Parabank_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Adactin_PageObject.Adactin_LoginPage;
import Parabank_PageObjects.Parabank_Register;
import junit.framework.Assert;

public class Parabank_TC_RegisterTest extends Parabank_BaseClass{
	@Test
	public void RegisterTest() throws IOException {
		
		Parabank_Register pr=new Parabank_Register(driver);
		
		pr.setfirstname(fName);
		log.info("firstName is entered");
		
		pr.setlastName(lastName);
		log.info("lastName is entered");
		
		pr.setstreet(street);
		log.info("street is entered");
		
		pr.setcity(city);
		log.info("city is entered");
		
		pr.setstate(state);
		log.info("state is entered");
		
		pr.setzipCode(zipCode);
		log.info("zipCode is entered");
		
		pr.setphoneNumber(pNumber);
		log.info("phoneNumber is entered");
		
		pr.setssn(ssn);
		log.info("ssn is entered");
		
		pr.setusername(UName);
		log.info("username is entered");
		
		pr.setPassword(PWord);
		log.info("password is entered");
		
		pr.setrepeatedPassword(rPassword);
		log.info("repeatedPassword is entered");
		
		pr.clickRegister();
		log.info("Register btn clicking activity is completed");
	
	String  Act_title=driver.getTitle();
	String Exp_title="ParaBank";
	
	if(Act_title.equals(Exp_title)) {
		
		Assert.assertTrue(true);
		log.info("testcase is passed");
	}else {
		
		captureScreen(driver,"RegisterTest");
		log.info("testcase is failed");
	}
		
	
	}
	

}
