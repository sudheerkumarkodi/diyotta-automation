package com.diyotta.utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.diyotta.constants.TestConstants;

public class ReadPropertiesFile {

	public static String getTestParameterProperty(String key) {
		String keyValue = "";
		// 1st-Read the properties file
		try {
			FileReader fileReader = new FileReader(TestConstants.TEST_PARAMETER_FILE);
			Properties prop = new Properties();
			// Load the Properties to memory
			prop.load(fileReader);
			keyValue = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Return the value
		return keyValue;
	}

}
