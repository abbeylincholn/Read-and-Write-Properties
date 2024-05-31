package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {
	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();

		// this is to read properties
		FileInputStream inputStream = new FileInputStream(
				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\ReadWriteFile\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputStream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));

		// this is to write to properties
		FileOutputStream outputStream = new FileOutputStream(
				"C:\\Users\\Engr. Abbey\\eclipse-workspace\\ReadWriteFile\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdata", "1234567");
		properties.store(outputStream, "This is the customer data");
	}

}
