package com.researchspace.repository.spi.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

public class StringRepoPropertyTest {

	@Test
	public void testToJson() throws JsonProcessingException {
		StringRepoProperty repoProp = createStringRepoProperty();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(repoProp);
		assertEquals("value", JsonPath.read(json, "$.string"));
	}

	private StringRepoProperty createStringRepoProperty() {
		return new StringRepoProperty("any", true, "value");
	}

}
