package cn.kingcar.encryptdecrypt.annotation;

import cn.kingcar.encryptdecrypt.autoconfigure.RiskEncryptDecryptAutoConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p>在Spring Boot启动类上加上此注解<p>
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({RiskEncryptDecryptAutoConfig.class})
public @interface EnableRiskEncryptDecrypt {

}
