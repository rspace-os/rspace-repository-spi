package com.researchspace.repository.spi;

import java.net.URL;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * For service operations that return a {@link Boolean} indicating success/failure, it can be useful
 * to return an entity back to the controller layer as well.
 */
@EqualsAndHashCode
@Getter
@AllArgsConstructor
public class RepositoryOperationResult {

  private boolean succeeded;
  private String message;
  private URL url;
  private URL doiUrl;

  public RepositoryOperationResult(boolean succeeded, String msg, URL resourceLink) {
    this.succeeded = succeeded;
    this.message = msg;
    this.url = resourceLink;
    this.doiUrl = null;
  }

}
