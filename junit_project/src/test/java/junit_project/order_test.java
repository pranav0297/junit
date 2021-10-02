package junit_project;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class order_test {
	
	
	@Test
	public void should_call_Perameter_Contructor_whenThree_valuePass() {
		
		//given
		 int quantity=2;
	     String itemName="test";
	     double price=200;
		
	// when 
	     Order o = new Order(quantity,itemName,price);
		
//then
	    		 assertEquals(itemName,o.getItemName());
	    		 assertEquals(quantity,o.getQuantity());
	    		assertNotSame(price,o.getPrice());
}
	
	@Test
	public void should_getQuantity_when_setQuantity() {
		 
		
		//given
		Order o = new Order();
		
		//when 
	     o.setQuantity(50);
		
		
		//then
		assertEquals(50,o.getQuantity());
}
	
	
	@Test
	public void should_getItemName_when_setItemName() {
		 
		
		//given
		Order o = new Order();
		
		//when 
	 o.setItemName("hello");
		
		
		//then
	 assertEquals("hello",o.getItemName());
}
	@Test
	public void should_getPrice_when_setPrice() {
		 
		
		//given
		Order o = new Order();
		
		//when 
	 o.setPrice(200d);
		
		
		//then
	 assertNotSame( 200 , o.getPrice());
}
	
	@Test
	public void should_getPriceWithTex_when_setPriceWithTex() {
		 
		
		//given
		Order o = new Order();
		
		//when 
	 o.setPriceWithTex(200);
		
		
		//then
	 assertNotSame( 200 , o.getPriceWithTex());
}
	
}
