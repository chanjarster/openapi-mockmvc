package me.chanjar.oas.server.validator.core.valuegen.schema;

import io.swagger.v3.oas.models.media.Schema;
import me.chanjar.oas.server.validator.core.value.schema.SchemaVal;

public interface SchemaValGenerator<S extends Schema, V extends SchemaVal> {

  boolean supports(Schema schema, SchemaValCons cons);

  V generate(S schema, SchemaValCons cons);

}
