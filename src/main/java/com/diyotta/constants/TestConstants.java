package com.diyotta.constants;

import static com.diyotta.utility.ReadPropertiesFile.*;

public class TestConstants {
	public static final String PROJECT_DIR = System.getProperty("user.dir");
	public static final String TEST_PARAMETER_FILE = PROJECT_DIR + "/src/test/resources/testparameters.properties";
	public static final String TEST_BROWSER = getTestParameterProperty("test.browser");
	public static final String CHROME_DRIVER_KEY = getTestParameterProperty("chrome.driver.key");
	public static final String FIREFOX_DRIVER_KEY = getTestParameterProperty("firefox.driver.key");
	public static final String DRIVER_BINARY_PATH = PROJECT_DIR + "/src/test/resources/drivers/";
	public static final String DI_USERNAME=getTestParameterProperty("login.username");
	public static final String DI_PASSWORD=getTestParameterProperty("login.password");

	public static final String APP_URL = getTestParameterProperty("app.url");
	public static final String OHRM_APP_URL = getTestParameterProperty("ohrm.app.url");
	
	public static final String CHROME_VERSION =  getTestParameterProperty("chrome.binary.version");
	public static final String FIREFOX_VERSION =  getTestParameterProperty("firefox.binary.version");
}
