package Gitpass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class Writedatafromeclipse {
	public static void main(String[] args) throws IOException {
		
	
	Properties p= new Properties();
	p.setProperty("username", "prashanth");
	p.setProperty("password", "abd@2017");
	p.setProperty("emailid", "kokmwdckjeffeej.com");
	
	FileOutputStream fos = new FileOutputStream("C:\\seleniumfolder\\advanceselenium\\123\\src\\test\\resources\\eclipse.properties");
	p.store(fos, "hiiiiii");

}
}