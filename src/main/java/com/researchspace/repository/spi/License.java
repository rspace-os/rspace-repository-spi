package com.researchspace.repository.spi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * A License. Equality based on licenseDefinition.
 */
@Data
@EqualsAndHashCode(of = "licenseDefinition")
@AllArgsConstructor
@NoArgsConstructor
public class License {
	
	private LicenseDef licenseDefinition;
	
	/**
	 * Whether the license is the default or not for a particular repository.
	 */
	private Boolean defaultLicense;

}
