package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer {

	int counter=0;
	int retry=3;
	
	
	public boolean retry(ITestResult result) {
		//System.out.println("value of retry:"+counter++);
		
			if(counter<=retry) {
				counter++;
				
				System.out.println("value of counnter:"+counter++);
				return true;
				
			}
		return false;
	}
	

	
	
	
}
