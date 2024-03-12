package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public   class ConfigReader {

	public static  Properties intilizeproperties() {
Properties	 prop = new Properties();
	File file = new File("./src/test/resource/config/config.properties");
	try {
		FileInputStream stream = new FileInputStream(file);
		prop.load(stream);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return prop;
	
}
}