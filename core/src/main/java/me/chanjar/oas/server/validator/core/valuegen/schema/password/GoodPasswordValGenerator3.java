package me.chanjar.oas.server.validator.core.valuegen.schema.password;

import io.swagger.v3.oas.models.media.PasswordSchema;
import io.swagger.v3.oas.models.media.Schema;
import me.chanjar.oas.server.validator.core.value.schema.PasswordVal;
import org.apache.commons.lang3.StringUtils;

/**
 * Support maxLength != null
 */
public class GoodPasswordValGenerator3 implements PasswordValGenerator {

  @Override
  public boolean supports(Schema schema) {
    return PasswordSchemaSupport.supports(schema) && schema.getMaxLength() != null;
  }

  @Override
  public PasswordVal generate(PasswordSchema schema) {
    return new PasswordVal(StringUtils.repeat('p', schema.getMaxLength()));
  }

}
