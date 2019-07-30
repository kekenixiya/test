package cn.kingcar.encryptdecrypt.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

public final class AESUtils {
    /**
     * 默认AES key长度参数
     */
    private static final int DEFAESKEYLEN = 16;
    /**
     * 参数分别代表 算法名称/加密模式/数据填充方式
     */
    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";

    /**
     * 加密
     * @param content 加密的字符串
     * @param encryptKey key值
     * @return
     * @throws Exception
     */
    public static String encrypt(String content, String encryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));
        byte[] b = cipher.doFinal(content.getBytes("utf-8"));
        // 采用base64算法进行转码,避免出现中文乱码
        return Base64.encodeBase64String(b);

    }

    /**
     * 解密
     * @param encryptStr 解密的字符串
     * @param decryptKey 解密的key值
     * @return
     * @throws Exception
     */
    public static String decrypt(String encryptStr, String decryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"));
        // 采用base64算法进行转码,避免出现中文乱码
        byte[] encryptBytes = Base64.decodeBase64(encryptStr);
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        return new String(decryptBytes);
    }

    /**
     *  生成指定长度的AES加密字符串
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getDefLenRandowString(){
        return getRandomString(DEFAESKEYLEN);
    }

//    public static void main(String[] args) throws Exception {
//
//        String aesKey = getDefLenRandowString();
//
//        Map map=new HashMap<String,String>();
//        map.put("oldPassword","oldPassword-keke");
//        map.put("newPassword","newPassword-keke");
//        map.put("confirmNewPassword","confirmNewPassword-keke");
//        String serverPrikey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIq9aR7jYWKCsE5sLOITnMkWXzoE78RyX2pdMb5XgLwd5D2HFaXblmoxUxy0qGzdE9aMR9J/2JzPPg8D9LH8ooI/06iBU+RLRzeStOXHVILVdbOYJSryekMhNkLCRHVTNR37ww8e5vAtJs7qw9js99I5u8wSs2HGM+4zpDKs/EUNAgMBAAECgYBd33DcBG+lDtYqCcmIokqISMnf4O02V0i2GB6LMnuZTQRcmSUNlvk8GumoV5hKKH++wCXsiLJQz2ynDj8nms99H78KCq2PNnNwyw8yY4yCsLuB885Zn3xHzIu8glaNz7mToYCjpMNZYpfkhTgo2pskZkPaqgss61VRk3RxjfTXpQJBAMx5VoPXo90PMWvV1zmXfLYsDGViw13IHw5iPltEhe/v75FNI6bFGmU8V5bzJf0EFN6/rZsXWI183tBpdvBiFdcCQQCts4097wLzsODZNG8MSvNIbpd7XHKkqMT3nD98D1fFXyEzWqV+/CcXNvLSH2YEUGqcpEfQuCy5QOUuZKh5oBe7AkEAgfQMHDcNGg3x5ws9gojY5h8Qsc8XQ59QvZ+K6g6e4WOo6rwQEInswLKdKH7Ygfn6GafQ+mTYDvRx2BtvUE/GeQJAKnJZDoxsrT5JA+sDQ/7Ayq9zxwqFXWV8lIGTJe7d5PZlN5ZsIMbfipW76ssPc/huxQ6EGiYXj8Gi/55LaUVM5wJBALeTkyhM7HtRwT8KcgWES6lzNkwDYuMg4A39xlh+9p3jYWI2ya+xhLzKW9FlLAdLpyfR7k9Ftn1LEDklI7T5rIw=";
//        String clientPubkey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDII4siA+1Ad2nP0tD1AZl/7rfA6TeQ1rmd3n7R9xHHLw06Fz7xlO+SOUDYdem2z19Jm8lnKoQdCdve0e0rmwU2RKKKcmr89ATggeGpHRYoV7a3qnef0fT+B/dKX6wMrEZa3TqLJ/Gxk4rQYIYqOc55Q2B7IgOrNh2rBfTLUkeHKQIDAQAB";
//
//        System.out.println(aesKey);
//        String aesAfterRsa = RSAUtils.encryptedDataOnJava(aesKey,clientPubkey);
//        String dataAfterAes = AESUtils.encrypt(JSON.toJSONString(map),aesKey);
//
//        NormalTranObj normalTranObj = new NormalTranObj();
//        normalTranObj.setTokenParm(aesAfterRsa);
//        normalTranObj.setDataParm(dataAfterAes);
//        System.out.println("-----------------------------------");
//        System.out.println(JSON.toJSONString(normalTranObj));


//        String content = JSONObject.toJSONString(map);
//        System.out.println("加密前：" + content);
//        String encrypt = encrypt(content, aesKey);
//        System.out.println("加密后：" + encrypt);
//        String decrypt = decrypt(encrypt, aesKey);
//        System.out.println("解密后：" + decrypt);
//    }
}
