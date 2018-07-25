package me.chanjar.oas.server.validator.core.valuegen.schema.bytearray;

import io.swagger.v3.oas.models.media.ByteArraySchema;
import io.swagger.v3.oas.models.media.Schema;
import me.chanjar.oas.server.validator.core.value.schema.ByteArrayVal;
import me.chanjar.oas.server.validator.core.valuegen.schema.PrimitiveSchemaValGenerationService;

/**
 * {@link ByteArrayVal} generator for {@link ByteArraySchema}<br>
 * doc: <a href="https://tools.ietf.org/html/draft-wright-json-schema-validation-00#section-5">JSON Schema Validation</a>
 */
public class ByteArrayValGenerationService extends PrimitiveSchemaValGenerationService<ByteArraySchema> {

  @Override
  public boolean supports(Schema schema) {
    return ByteArraySchemaSupport.supports(schema);
  }

}
