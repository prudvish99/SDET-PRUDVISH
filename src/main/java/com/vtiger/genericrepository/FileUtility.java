package com.vtiger.genericrepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.Icon;

public class FileUtility {

	
	/**
	 * @author prudvish
	 * Read the data from Property file
	 * @param path of property file
	 * @param Pass Key for which u want to read data
	 * @return value
	 * @throws IOException
	 */
	public String readDatafrompropfile(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(Iconstants.propfilepath);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}

}
