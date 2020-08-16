package admhacked.project.digiLearn.DAO;
import java.util.*;
import java.io.*;

public class DBLogin {
	public String getUsername() throws IOException  {
		FileReader reader = null;
			reader = new FileReader("C:\\Users\\Ankur Karmakar\\eclipse-workspace\\digiLearn\\src\\main\\resources\\application.properties");
		Properties p=new Properties(); 
			p.load(reader);
		return p.getProperty("spring.datasource.username");
	}

	public String getPassword() throws IOException {
		FileReader reader = null;
		reader = new FileReader("C:\\Users\\Ankur Karmakar\\eclipse-workspace\\digiLearn\\src\\main\\resources\\application.properties");
	Properties p=new Properties(); 
		p.load(reader);
	return p.getProperty("spring.datasource.password");
	}
	public String getDatabase() throws IOException {
		FileReader reader = null;
		reader = new FileReader("C:\\Users\\Ankur Karmakar\\eclipse-workspace\\digiLearn\\src\\main\\resources\\application.properties");
	Properties p=new Properties(); 
		p.load(reader);
	return p.getProperty("database");
	}
}
