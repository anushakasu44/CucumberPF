package Utilities;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadPropertiesFile {



	
	 
	public static void readProperties() throws Exception{
		try{
			 Properties readprop=new Properties();
		    FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//resourses//config.properties");
			readprop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}