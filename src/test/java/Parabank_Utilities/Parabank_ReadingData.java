package Parabank_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Parabank_ReadingData {
	Properties pro;
	public  Parabank_ReadingData() {
		
		File f=new File("E:\\FrameWorks\\Maven_HybridFrameWork\\Configuration\\data.properties_2");
	
		try {
			//it is converted into reading mode
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);//load the file input stream
		}catch(Exception e) {
			e.printStackTrace();//it is provide the proper information about exception,which line of code getting error 
		}
	
		
	
	}
	
	public String getAppURL() { //get the application url
		
		String url=pro.getProperty("appURL");
		return url;
	}
	public String getfirstname() {
		String firstname=pro.getProperty("firstname");
		return firstname;
	}
	public String getlastName() {
		String lastName=pro.getProperty("lastName");
		return lastName;
	}
	public String getstreet() {
		String street=pro.getProperty("street");
		return street;
	}
	public String getcity() {
		String city=pro.getProperty("city");
		return city;
	}
	public String getstate() {
		String state=pro.getProperty("state");
		return state;
	}
	public String getzipCode() {
		String zipCode=pro.getProperty("zipCode");
		return zipCode;
	}
	public String getphoneNumber() {
		String pnumber=pro.getProperty("phoneNumber");
		return pnumber;
	}
	public String getssn() {
		String ssn=pro.getProperty("ssn");
		return ssn;
	}
	
	public String getUsername() {
		
		String uname=pro.getProperty("userName");
		return uname;
	}
	
	public String getPassword() {
		
		String pword=pro.getProperty("Password");
		return pword;
				
	}
	public String getrepeatedPassword() {
		String rPassword=pro.getProperty("repeatedPassword");
		return rPassword;
	}

}
