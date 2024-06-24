package com.researchspace.repository.spi;

import java.net.URL;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;
/**
 * A definition of a license, an immutable value object.
 *
 */
@Value
@EqualsAndHashCode(of="url")
public class LicenseDef {
	
	/**
	 * Official URL of the license
	 */
	@NonNull URL url;
	
	/**
	 * Display name of the license
	 */
	@NonNull String name;

}
