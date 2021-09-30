package junit_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailService_test {
	@Test
	public void should_returnInstance_when_InstanceEquals_Null() {
		
		//given
		
		
		//when 
		EmailService s=  EmailService.getInstance();						  
		
		
		//then
		assert(s) != null;
	}
	
	
	
	
	@Test
	public void should_returnException_when_sendEmail() {
		EmailService e = new EmailService();
		
		//given
		Order cc = null;
		
		
		//when 
	
		
		//then
		assertThrows(RuntimeException.class,()-> e.sendEmail(cc));
	}
	
	

	@Test
	public void should_returnTrue_when_sendEmail() {
		EmailService e = new EmailService();
		
		//given
		int i=2;
		String cc="hello";
		
		
		//when 
		boolean result = e.sendEmail(i, cc);
		
		
		//then
		assertTrue(result);
	}
	
}
