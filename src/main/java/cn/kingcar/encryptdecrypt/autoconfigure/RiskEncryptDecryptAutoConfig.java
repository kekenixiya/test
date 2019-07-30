package cn.kingcar.encryptdecrypt.autoconfigure;

import cn.kingcar.encryptdecrypt.config.EncryptDecryptConfig;
import cn.kingcar.encryptdecrypt.reqresadvice.DecodeRequestBodyAdvice;
import cn.kingcar.encryptdecrypt.reqresadvice.EncodeResponseBodyAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@Configuration
//@EnableAutoConfiguration
@EnableConfigurationProperties(EncryptDecryptConfig.class)
public class RiskEncryptDecryptAutoConfig {

    @Autowired
    private EncryptDecryptConfig encryptDecryptConfig;

//    @Bean
//    public FilterRegistrationBean repeatedlyReadFilter() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        RepeatedlyReadFilter repeatedlyReadFilter = new RepeatedlyReadFilter();
//        registration.setFilter(repeatedlyReadFilter);
//        registration.setName("RiskEncryptDecrypFilter");
//        registration.addUrlPatterns(encryptDecryptConfig.getFilterUrl());
//        registration.setOrder(encryptDecryptConfig.getFilterOrder());
//        return registration;
//    }

    @Bean
    public RequestBodyAdvice getRequestBodyAdvice(){
        return  new DecodeRequestBodyAdvice();
    }

    @Bean
    public ResponseBodyAdvice getResponseBodyAdvice(){
        return new EncodeResponseBodyAdvice();
    }
}
