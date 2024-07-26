package class_61_Read_config_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Simple_Config_Reader {

	@Test
	public void readConfig() throws IOException {

		File src = new File("./Config/Config.properties");

		FileInputStream fis = new FileInputStream(src);

		Properties pro = new Properties();

		pro.load(fis);

		System.out.println(pro.getProperty("url"));

	}


	
}
