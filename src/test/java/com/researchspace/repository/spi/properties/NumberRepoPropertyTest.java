package com.researchspace.repository.spi.properties;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

public class NumberRepoPropertyTest {

	@Test
	public void testToJson() throws JsonProcessingException {
		BooleanRepoProperty repoProp = createBooleanRepoProperty();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(repoProp);
		assertTrue(((Boolean)JsonPath.read(json, "$.boolean")));
	}

	private BooleanRepoProperty createBooleanRepoProperty() {
		return new BooleanRepoProperty("any", true, true);
	}
	

}
