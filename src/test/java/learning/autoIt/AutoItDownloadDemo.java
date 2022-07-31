package learning.autoIt;

import java.io.File;
import java.io.IOException;

public class AutoItDownloadDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		String scriptFilePath = System.getProperty("user.dir") + "/AutoItCode/downloadFileScript.exe";
		String downloadFromPath = "https://github.com/arunmotoori/DownloadDemo/archive/master.zip";
		String downloadToPath = System.getProperty("user.dir")+"/DownloadFiles/DownloadDemo-master.zip";
		String[] cmd= {scriptFilePath,downloadToPath,downloadFromPath};
		Runtime.getRuntime().exec(cmd);
		Thread.sleep(5000);
		File file = new File(
				downloadToPath);
		if (file.exists()) {
			System.out.println("File has been downloaded successfully.");
		} else {
			System.err.println("File download has been failed");
		}
	}

}
