package cn.kingcar.encryptdecrypt.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "risk.crypt")
public class EncryptDecryptConfig {
    /**
     * 服务端私钥
     */
    private String serverPrikey;

    /**
     * 客户端公钥
     */
    private String clientPubkey;

    /**
     *  加密解密过滤器拦截url
     */
    private String filterUrl;

    /**
     *  加密解密过滤器优先级别
     */
    private Integer filterOrder;
}
