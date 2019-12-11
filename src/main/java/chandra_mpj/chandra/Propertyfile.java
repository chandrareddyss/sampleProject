package chandra_mpj.chandra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

public class Propertyfile {
	@Test
	//public static HashMap<String,String> files() throws IOException {
		
		/*FileInputStream fis=new FileInputStream(System.getProperty("./Testdata//config.properties"));
		Properties p=new Properties();
		p.load(fis);
		Set<Object>keys=p.keySet();
		for(Object key:keys) {
			Data.hm.put(key.toString(),p.getProperty(keys.toString()));
		}return Data.hm;*/
		
		public static  HashMap<String,String> properties() throws IOException {
		FileInputStream fis=new FileInputStream((System.getProperty("user.dir")+"/Testdata//config1.properties"));
		Properties p=new Properties();
		p.load(fis);
		Set<Object>k=p.keySet();
		for(Object k1:k) {
			String s=p.getProperty(k.toString());
			Data.hm.put(k1.toString(),p.getProperty(k.toString()));
		}return Data.hm;
		
	}

}
