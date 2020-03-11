package lab10.exercise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFileReadWrite {

	public void fileRead() {
		try(FileReader reader=new FileReader("E:\\at\\Module1\\CoreJava\\Labs\\src\\lab10\\exercise1\\PersonProps.properties");){
			Properties prop =new Properties();
			prop.load(reader);
			Enumeration em = prop.keys();
			  while(em.hasMoreElements()){
			  String str = (String)em.nextElement();
			  System.out.println(prop.getProperty(str));
			  }
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void fileWrite() {
		try(FileWriter writer=new FileWriter("E:\\at\\Module1\\CoreJava\\Labs\\src\\lab10\\exercise1\\PersonProps.properties",true);){
			Properties prop =new Properties();
			prop.setProperty("E3","Sujit");  
			prop.setProperty("email","sonoojaiswal@javatpoint.com");
			prop.store(writer,"Person Details");  
			  
			  
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
