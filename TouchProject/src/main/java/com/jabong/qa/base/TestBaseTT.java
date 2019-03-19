package com.jabong.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBaseTT
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBaseTT() 
	{
		prop=new Properties();
		FileInputStream fss = null;
		try {
			fss = new FileInputStream("F:\\Testing Workspace\\TouchProject\\src\\main\\java\\com\\jabong\\qa\\config\\config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(fss);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
