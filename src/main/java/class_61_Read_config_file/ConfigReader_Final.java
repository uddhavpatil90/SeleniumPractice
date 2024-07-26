package class_61_Read_config_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigReader_Final {

	public static String readConfig(String propertyName) {

		Properties pro = new Properties();

		try {
			pro.load(new FileInputStream(new File("./Config/Config.properties")));
		} catch (FileNotFoundException e) {
			System.out.println("Log - File not found " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Log - Exception found " + e.getMessage());

		}

		String value = pro.getProperty(propertyName);

		return value;

	}

	public static String readConfig(String propertyName, String propertyFileName) {

		Properties pro = new Properties();

		try {
			pro.load(new FileInputStream(new File("./Config/" + propertyFileName + ".properties")));
		} catch (FileNotFoundException e) {
			System.out.println("Log - File not found " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Log - File not loaded " + e.getMessage());

		}

		String value = pro.getProperty(propertyName);

		return value;

	}

}
