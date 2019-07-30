package cn.kingcar.encryptdecrypt.reqresadvice;

import cn.kingcar.encryptdecrypt.annotation.SecurityParameter;
import cn.kingcar.encryptdecrypt.config.EncryptDecryptConfig;
import cn.kingcar.encryptdecrypt.constant.FinalDataKey;
import cn.kingcar.encryptdecrypt.utils.AESUtils;
import cn.kingcar.encryptdecrypt.utils.RSAUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据加密操作
 */
@ControllerAdvice
public class EncodeResponseBodyAdvice implements ResponseBodyAdvice {

    private final static Logger logger = LoggerFactory.getLogger(EncodeResponseBodyAdvice.class);

    @Autowired
    private EncryptDecryptConfig encryptDecryptConfig;

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        if (methodParameter.getMethod().isAnnotationPresent(SecurityParameter.class)) {
            //获取注解配置的包含和去除字段
            SecurityParameter serializedField = methodParameter.getMethodAnnotation(SecurityParameter.class);
            //出参是否需要加密
            if (serializedField.outEncode()){
                logger.info("对方法method :【" + methodParameter.getMethod().getName() + "】返回数据进行加密");
                return encodeAesRsa(methodParameter,body);
            }
        }
        return body;
    }

    /**
     * 混合加密
     * @return
     */
    private Object encodeAesRsa(MethodParameter methodParameter, Object body){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(body);
            // 生成aes秘钥
            String aseKey = AESUtils.getRandomString(16);
            // rsa加密
            String encrypted = RSAUtils.encryptedDataOnJava(aseKey, encryptDecryptConfig.getClientPubkey());
            // aes加密
            String requestData = AESUtils.encrypt(result, aseKey);
            Map<String, String> map = new HashMap<>();
            map.put(FinalDataKey.PARM_TOKEN, encrypted);
            map.put(FinalDataKey.PARM_DATA, requestData);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("对方法method :【" + methodParameter.getMethod().getName() + "】返回数据进行解密出现异常：" + e.getMessage());
        }
        return body;
    }
}