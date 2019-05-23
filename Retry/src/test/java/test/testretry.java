package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testretry {


	
	//@Test(retryAnalyzer=Analyzer.retryAnalyzer.class)
	@Test
	public void test12() {
	
		Assert.assertEquals(false, true);
		//System.out.println("test case number 12");
		
		
	}
	//@Test(retryAnalyzer=Analyzer.retryAnalyzer.class)
	@Test
public void test13() {
		Assert.assertEquals(false, true);
		System.out.println("test case number 13");
		
	}
	
}
