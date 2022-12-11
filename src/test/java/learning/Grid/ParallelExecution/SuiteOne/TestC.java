package learning.Grid.ParallelExecution.SuiteOne;

import org.testng.annotations.Test;

public class TestC {
	@Test
	public void testC() throws InterruptedException {
		System.out.println("Starting Test C");
		Thread.sleep(3000);
		System.out.println("Ending Test C");
	}
}
