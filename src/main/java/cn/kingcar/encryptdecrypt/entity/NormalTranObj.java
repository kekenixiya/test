package cn.kingcar.encryptdecrypt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NormalTranObj {
    /**
     * 保存发送方AES键经过RSA公钥加密的字符串
     */
    private String tokenParm;
    /**
     * 保存发送方AES键加密后的数据
     */
    private String dataParm;

}
