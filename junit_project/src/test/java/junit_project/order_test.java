package junit_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class order_test {
	
	
	@Test
	public void should_call_default_Contructor() {
		
		
		//given
		
		//when 
	     Order o = new Order();
		
		
		//then
		equals(o);

}

	@Test
	public void should_call_Perameter_Contructor_whenThree_valuePass() {
		
		
		//given
		 int quantity=2;
	     String itemName="test";
	     double price=200;
		
		
		//when 
	     Order o = new Order(quantity,itemName,price);
		
		
		//then
		equals(o);
}
	
	@Test
	public void should_return_Quantity_when_getQuantity() {
		 Order o = new Order();
		
		//given
		
		
		//when 
	     int n = o.getQuantity();
		
		
		//then
		equals(n);
}
	
	@Test
	public void should_return_this_when_setQuantity() {
		 Order o = new Order();
		
		//given
		int n=0;
		
		//when 
	  Order n1 = o.setQuantity(n);
		
		
		//then
		equals(n1);
}
	
	@Test
	public void should_return_ItemName_when_getItemName() {
		 Order o = new Order();
		
		//given
		
		//when 
	 String s =  o.getItemName();
		
		
		//then
		equals(s);
}
	
	@Test
	public void should_return_this_when_setItemName() {
		 Order o = new Order();
		
		//given
		String s1 = "world";
		
		
		//when 
	   Order n= o.setItemName(s1);
		
		
		//then
		equals(n);
}
	
	@Test
	public void should_return_price_when_getPrice() {
		 Order o = new Order();
		
		//given
		
		
		//when 
	     double n1 =  o.getPrice();
		
		
		//then
		equals(n1);
}
	@Test
	public void should_return_this_when_setPrice() {
		 Order o = new Order();
		
		//given
		double n = 1;
		
		//when 
	     Order n1 =  o.setPrice(n);
		
		
		//then
		equals(n1);
}
	
	@Test
	public void should_return_priceWithTex_when_getpriceWithTex() {
		 Order o = new Order();
		
		//given
		
		//when 
	     double n1 =  o.getPriceWithTex();
		
		
		//then
		equals(n1);
}
	
	@Test
	public void should_return_this_when_setpriceWithTex() {
		 Order o = new Order();
		
		//given
		double n = 1;
		
		//when 
	     Order n1 =  o.setPriceWithTex(n);
		
		
		//then
		equals(n1);
}
	
}
