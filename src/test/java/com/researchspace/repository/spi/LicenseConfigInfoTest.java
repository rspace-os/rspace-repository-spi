package com.researchspace.repository.spi;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LicenseConfigInfoTest {

	@BeforeEach
	public void setUp() {
	}

	@AfterEach
	public void tearDown() {
	}

	@Test
	public void testLicenseConfigInfoThrowsIAEIfConfigInvalid() {
		assertThrows(IllegalArgumentException.class, ()->new LicenseConfigInfo(false, false, Collections.emptyList()));
	}

	@Test
	public void testLicenseConfigInfoAllowDefaultThrowsIAEIfConfigInvalid() {
		assertThrows(IllegalArgumentException.class, ()->new LicenseConfigInfo(true, false, Collections.emptyList()));
	}

	@Test
	public void testLicenseConfigOKWIthNullList() {
		LicenseConfigInfo lci = new LicenseConfigInfo(true, true, null);
		assertNotNull(lci.getLicenses());
		assertTrue(lci.getLicenses().isEmpty());
		lci = new LicenseConfigInfo(true, true, Collections.emptyList());
		assertTrue(lci.getLicenses().isEmpty());
	}

}
