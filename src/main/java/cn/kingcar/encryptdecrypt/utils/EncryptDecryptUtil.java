package cn.kingcar.encryptdecrypt.utils;

import cn.kingcar.encryptdecrypt.constant.FinalDataKey;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

public final class EncryptDecryptUtil {

    public static String SimpleSendEncrypt(String clientPubKey,String sendData ) throws Exception{
        if(clientPubKey == null ||  clientPubKey.trim().equals("") || sendData == null ||  sendData.trim().equals("") ){
            return null;
        }
        //生成默认16位AES秘钥
        String aeskey = AESUtils.getDefLenRandowString();
        String aeskeyAfterRsa = RSAUtils.encryptedDataOnJava(aeskey,clientPubKey);
        String sendDataAfterAes =    AESUtils.encrypt(sendData,aeskey);
        Map<String,String> sendMap = new HashMap<>();
        sendMap.put(FinalDataKey.PARM_TOKEN,aeskeyAfterRsa);
        sendMap.put(FinalDataKey.PARM_DATA,sendDataAfterAes);
        return JSON.toJSONString(sendMap);
    }

    public static String SimpleAcceptDecrypt(String serverPriKey,String acceptData ) throws Exception{
        if(serverPriKey == null ||  serverPriKey.trim().equals("") || acceptData == null ||  acceptData.trim().equals("") ){
            return null;
        }
        Map<String,String> acceptMap = new Gson().fromJson(acceptData,new TypeToken<Map<String,String>>() {
        }.getType());
        // 密文
        String data = acceptMap.get(FinalDataKey.PARM_DATA);
        //加密的ase秘钥
        String aesEncrypt = acceptMap.get(FinalDataKey.PARM_TOKEN);
        String aeskey = RSAUtils.decryptDataOnJava(aesEncrypt,serverPriKey);
        String sendDataAfterAes =    AESUtils.decrypt(data,aeskey);
        return sendDataAfterAes;
    }

//     public static void main(String[] args) throws Exception {
//
//        System.out.println("=============================解密=========================================");
//        String acceptData = "{\"parm_token\":\"VFPelF0wRKWgGP23Hi6QSLbd6ltx/gXxFKJJdZKNHYIk6uY5kOsEGeCE00CRC1dHlT4KI9olq0J3QsTckTAlhq7WTk5DebsurZKu71caifqsxmONIBrrGs1r2qGKXLO0q9o0IBvgsDG3rBgbt6Y3bkOq3vpy1yvki9ng0YKGKsY=\",\"parm_data\":\"vYC6YxIRZmDuMbZeMRtuCX88Xrho94IuBtsRxVORKYOVTXoG5yA3AGpVkykDUPKFIkQdIM/dGk4TuHygamfBgZuY+jWYf8TwXcX1KsSguH/7DlJ8IaGguJbD6rAmyNM7QAO6NeABDXVmm95BkMkF6hxRIz3HUXA5+rL8OeWfmQM=\"}";
//
//        String serverPrikey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIq9aR7jYWKCsE5sLOITnMkWXzoE78RyX2pdMb5XgLwd5D2HFaXblmoxUxy0qGzdE9aMR9J/2JzPPg8D9LH8ooI/06iBU+RLRzeStOXHVILVdbOYJSryekMhNkLCRHVTNR37ww8e5vAtJs7qw9js99I5u8wSs2HGM+4zpDKs/EUNAgMBAAECgYBd33DcBG+lDtYqCcmIokqISMnf4O02V0i2GB6LMnuZTQRcmSUNlvk8GumoV5hKKH++wCXsiLJQz2ynDj8nms99H78KCq2PNnNwyw8yY4yCsLuB885Zn3xHzIu8glaNz7mToYCjpMNZYpfkhTgo2pskZkPaqgss61VRk3RxjfTXpQJBAMx5VoPXo90PMWvV1zmXfLYsDGViw13IHw5iPltEhe/v75FNI6bFGmU8V5bzJf0EFN6/rZsXWI183tBpdvBiFdcCQQCts4097wLzsODZNG8MSvNIbpd7XHKkqMT3nD98D1fFXyEzWqV+/CcXNvLSH2YEUGqcpEfQuCy5QOUuZKh5oBe7AkEAgfQMHDcNGg3x5ws9gojY5h8Qsc8XQ59QvZ+K6g6e4WOo6rwQEInswLKdKH7Ygfn6GafQ+mTYDvRx2BtvUE/GeQJAKnJZDoxsrT5JA+sDQ/7Ayq9zxwqFXWV8lIGTJe7d5PZlN5ZsIMbfipW76ssPc/huxQ6EGiYXj8Gi/55LaUVM5wJBALeTkyhM7HtRwT8KcgWES6lzNkwDYuMg4A39xlh+9p3jYWI2ya+xhLzKW9FlLAdLpyfR7k9Ftn1LEDklI7T5rIw=";
//
//        String  acceptMessage =  SimpleAcceptDecrypt(serverPrikey,acceptData);
//
//        System.out.println(acceptMessage);
//
//        System.out.println("=============================解密=========================================");
//
//        System.out.println("=============================加密=========================================");
//        Map map=new HashMap<String,String>();
//        map.put("businessNo","vxdb2019032916554421");
//        map.put("settleName","李光旭");
//        map.put("settlePhone","13457678891");
//         map.put("settleCardId","221721199109104017");
//         map.put("carModel","jeep 自由之光");
//         map.put("carLicence","浙A 88591");
//         map.put("applyTime",new Date());
//
//        String sendData = JSON.toJSONString(map);
//        String clientPubkey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDII4siA+1Ad2nP0tD1AZl/7rfA6TeQ1rmd3n7R9xHHLw06Fz7xlO+SOUDYdem2z19Jm8lnKoQdCdve0e0rmwU2RKKKcmr89ATggeGpHRYoV7a3qnef0fT+B/dKX6wMrEZa3TqLJ/Gxk4rQYIYqOc55Q2B7IgOrNh2rBfTLUkeHKQIDAQAB";
//
//        String  sendMessage =  SimpleSendEncrypt(clientPubkey,sendData);
//        System.out.println(sendMessage);
//        System.out.println("=============================加密=========================================");
//
//    }
}
