package class_61_Read_config_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Refratrored_Config_Reader {

	@Test
	public void readConfigrefratored() {

		Properties pro = new Properties();

		try {
			pro.load(new FileInputStream(new File("./Config/Config.properties")));
		} catch (FileNotFoundException e) {
			System.out.println("Log-Info - File not Found : " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Log-Info - InputException : " + e.getMessage());

		}

		System.out.println(pro.getProperty("username"));
		
	}

}
