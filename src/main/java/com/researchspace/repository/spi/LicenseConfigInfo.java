package com.researchspace.repository.spi;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.Validate;

import lombok.Value;

/**
 * Encapsulates information about what license information is needed.
 */
@Value
public class LicenseConfigInfo {
	
	/**
	 * Public constructor. 
	 * @param licenseRequired whether the license is mandatory or not
	 * @param otherLicensePermitted whether a user-supplied license is permissible. This must be true
	 *        if  <code>licenses</code> is empty
	 * @param licenses Optional list of recommended licenses, can be <code>null</code>
	 * @throws IllegalArgumentException if <code>licenses</code> is empty and <code>otherLicensePermitted</code>
	 *  is false (see RSPAC-1157 license decision table condition 5).
	 */
	public LicenseConfigInfo (boolean licenseRequired, boolean otherLicensePermitted, List<License> licenses) {
		Validate.isTrue(!((licenses == null || licenses.isEmpty()) && !otherLicensePermitted),
				"If licenses are empty, you must allow 'otherLicensePermitted' to be true");
		this.licenseRequired = licenseRequired;
		this.otherLicensePermitted = otherLicensePermitted;
		this.licenses = licenses == null? new ArrayList<>():licenses;
	}

	/**
	 * Boolean test for whether license information must be included with the
	 * deposit <br/>
	 */
	boolean licenseRequired;
	
	/**
	 * Boolean test for whether any arbitrary license can be used by the
	 * repository. <br/>
	 */
	boolean otherLicensePermitted;
	
	/**
	 * List of recommended licenses.
	 */
	List<License> licenses;

}
