package utilities;

import java.util.Date;

public class Commonutilities {
	public static String generatetimestamp() {
		Date date = new Date();
		return "madhavi"+date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
		
	}
	

}
