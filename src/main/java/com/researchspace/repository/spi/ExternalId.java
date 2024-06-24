package com.researchspace.repository.spi;

import lombok.NonNull;
import lombok.Value;

/**
 * An external identifier e.g. 'ORCID'.
 */
@Value
public class ExternalId {

	@NonNull IdentifierScheme scheme;
	@NonNull String identifier;

}
