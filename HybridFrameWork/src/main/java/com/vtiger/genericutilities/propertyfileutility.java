package com.vtiger.genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfileutility {//notepad fetching utility
	public String readdatafrompropertyfile(String key) throws IOException {
		FileInputStream fisp = new FileInputStream (".Iconstantutility.propertyfilepath");
		Properties p = new Properties();
		p.load(fisp);
		return p.getProperty(key);
		
	}

}
