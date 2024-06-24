package com.researchspace.repository.spi;

import java.net.URI;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class ControlledVocabularyTerm {

  // The string value of the term
  private @NonNull String value;

  // The name of the controlled vocabulary from which the term comes
  private String vocabulary;

  // A unique identifier for the term, typically a URL
  private URI uri;

}
