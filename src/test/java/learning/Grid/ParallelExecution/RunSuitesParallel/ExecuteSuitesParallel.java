package learning.Grid.ParallelExecution.RunSuitesParallel;

import java.util.Arrays;

import org.testng.TestNG;

public class ExecuteSuitesParallel {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestSuites(Arrays.asList(new String[] { System.getProperty("user.dir") + "\\master-testng.xml" }));
		testng.setSuiteThreadPoolSize(2);
		testng.run();
	}

}
