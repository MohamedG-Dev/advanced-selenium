package learning.Grid.ParallelExecution.SuiteOne;

import org.testng.annotations.Test;

public class TestA {
	@Test
	public void testA() throws InterruptedException {
		System.out.println("Starting Test A");
		Thread.sleep(3000);
		System.out.println("Ending Test A");
	}
}
