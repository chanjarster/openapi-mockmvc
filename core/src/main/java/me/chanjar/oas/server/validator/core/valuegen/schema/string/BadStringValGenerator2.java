package me.chanjar.oas.server.validator.core.valuegen.schema.string;

import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import me.chanjar.oas.server.validator.core.value.schema.StringVal;
import me.chanjar.oas.server.validator.core.valuegen.schema.SchemaValCons;
import org.apache.commons.lang3.StringUtils;

/**
 * Support maxLength != null
 */
public class BadStringValGenerator2 implements StringValGenerator {

  @Override
  public boolean supports(Schema schema, SchemaValCons cons) {
    return StringSchemaSupport.supports(schema) && schema.getMaxLength() != null;
  }

  @Override
  public StringVal generate(StringSchema schema,
      SchemaValCons cons) {
    return new StringVal(StringUtils.repeat('s', schema.getMaxLength() + 1));
  }

}
