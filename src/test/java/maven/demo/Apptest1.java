package maven.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Apptest1 {

	@Test
	public void test() {
		Welcome h= new Welcome();
		String result =h.sayWelcome("Tester");
				
		Assert.assertEquals("Not matched...", "Hello Tester", result); 
	}

}
