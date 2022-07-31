package learning.autoIt;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		String autoItFilePath = System.getProperty("user.dir") + "/AutoItCode/methodsDemo.exe";
		String title = "www.AutoItDemo.com";
		String message = "This is AutoIt Demo";
		String[] cmd = {autoItFilePath,title,message};
		Runtime.getRuntime().exec(cmd);

	}

}
