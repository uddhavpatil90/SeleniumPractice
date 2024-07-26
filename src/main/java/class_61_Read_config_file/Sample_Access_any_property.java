package class_61_Read_config_file;

import org.testng.annotations.Test;

public class Sample_Access_any_property {

	@Test
	public void accessConfig() {

		System.out.println(ConfigReader_Final.readConfig("username"));
		System.out.println(ConfigReader_Final.readConfig("username", "Config2")); // method overloading

	}

}
