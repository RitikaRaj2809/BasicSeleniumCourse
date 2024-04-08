package framework;

import org.testng.annotations.Test;

public class TestNGImplementation {
	
	@Test(invocationCount = 2)
	public void createContact() {

		System.out.println("contact created");
	}

	@Test(enabled = false)
	public void modifyContact() {
		System.out.println("contact modified");
	}

	@Test
	public void deleteContact() {
		System.out.println("contact deleted");
	}

}
