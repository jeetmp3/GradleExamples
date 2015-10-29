package demo;

import org.apache.commons.lang3.StringUtils;
import demo.logger.Logger;

public class MainApp {
	public static void main(String[] args) {
		String text = "tHIS iS tEXT mESSAGE";
		Logger logger = new Logger();
		logger.info(StringUtils.swapCase(text));
		logger.debug(text);
	}
}
				
