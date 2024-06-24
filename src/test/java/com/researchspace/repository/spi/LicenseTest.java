package com.researchspace.repository.spi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

public class LicenseTest {

	@Test
	public void equals() throws MalformedURLException {
		License l1 = new License(new LicenseDef(new URL("http://l1"), "l1"), false);
		License l2 = new License(new LicenseDef(new URL("http://l1"), "l2"), false);
		assertEquals(l1, l2);
		assertEquals(l1.hashCode(), l2.hashCode());
	}

}
