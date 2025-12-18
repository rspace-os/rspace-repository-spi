package com.researchspace.repository.spi.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

public class ListRepoPropertyTest {

	@Test
	public void testToJson() throws JsonProcessingException {
		ListRepoProperty repoProp = createListRepoProperty();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(repoProp);
		assertEquals(2, ((Integer)JsonPath.read(json, "$.list.length()")).intValue());
		assertEquals("LIST", JsonPath.read(json, "$.type"));
	}

	private ListRepoProperty createListRepoProperty() {
		return new ListRepoProperty("any", true, Arrays.asList("a", "b"));
	}
	

}
