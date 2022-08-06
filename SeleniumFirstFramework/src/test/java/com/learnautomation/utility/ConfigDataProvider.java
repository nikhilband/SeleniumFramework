package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Config/Config.properties");

		System.out.println("file name :-" + src.getName());
		try {

			FileInputStream fs = new FileInputStream(src);
			pro = new Properties();
			pro.load(fs);

			System.out.println("File loades :-" + fs.toString());
		} catch (Exception e) {
			System.out.println("Not able to load confog file >>" + e.getMessage());
		}

	}

	public String getDataFromConfig(String keyToSearch) {

		return keyToSearch;
	}

	public String getBrowse() {

		return pro.getProperty("Browser");
	}

	public String getStringURL() {

		return pro.getProperty("qaURL");

	}

}
