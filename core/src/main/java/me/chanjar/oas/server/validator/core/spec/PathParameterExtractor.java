package me.chanjar.oas.server.validator.core.spec;

import io.swagger.v3.oas.models.parameters.PathParameter;

public class PathParameterExtractor extends AbstractParameterExtractor<PathParameter> {

  public PathParameterExtractor() {
    super("path");
  }

}
