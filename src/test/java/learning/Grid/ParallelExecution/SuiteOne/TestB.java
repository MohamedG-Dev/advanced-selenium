package learning.Grid.ParallelExecution.SuiteOne;

import org.testng.annotations.Test;

public class TestB {
	@Test
	public void testB() throws InterruptedException {
		System.out.println("Starting Test B");
		Thread.sleep(3000);
		System.out.println("Ending Test B");
	}
}
