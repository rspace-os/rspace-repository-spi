package com.researchspace.repository.spi.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

public class BooleanRepoPropertyTest {

	@Test
	public void testToJson() throws JsonProcessingException {
		NumberRepoProperty repoProp = createNumberRepoProperty();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(repoProp);
		assertEquals(23, ((Integer)JsonPath.read(json, "$.number")).intValue());
	}

	private NumberRepoProperty createNumberRepoProperty() {
		return new NumberRepoProperty("any", true, 23);
	}
	

}
