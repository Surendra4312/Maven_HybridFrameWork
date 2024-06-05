package Adactin_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Adactin_Utilities.ExcelReading;

public class Adacton_DatadrivenTest extends Adactin_BaseClass {

	
	@Test(dataProvider="SampleExcel")
	public void datadriventest(String user11,String pwd11) {
		
		Adactin_PageObject.Adactin_LoginPage lp=new Adactin_PageObject.Adactin_LoginPage(driver);
		
		lp.setIUsername(user11);
		lp.setPassword(pwd11);
		lp.ClickLoginBtn();
	}
	@DataProvider(name="SampleExcel")
	String [][] getData() throws IOException{
		
		String path="E:\\FrameWorks\\Maven_HybridFrameWork\\src\\test\\java\\TestData\\SampleExcel.xlsx";
		
		//it is identify the rowcount
		int rownum=ExcelReading.getRowCount(path, "Sheet1");
		//identify the colcount
		int colcount=ExcelReading.getCellcount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {//it is represents rows
			
			for(int j=0;j<colcount;j++) {//it is represents the columns
				
				logindata[i-1][j]=ExcelReading.getcelldata(path, "Sheet1", i, j);//1,0
			}
			
		}
		return logindata;
	}
	

}
