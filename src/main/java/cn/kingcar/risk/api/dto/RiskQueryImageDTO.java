package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;


/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto
 * @Author: keke
 * @CreateDate:
 * @Description: 风控查询申请图片包装DTO
 */
@Data
public class RiskQueryImageDTO implements Serializable {

    private static final long serialVersionUID = -7807297997098140455L;

    /*
     *  图片类型
     */
    private String code;
    /*
     *  图片地址Url
     */
    private String imageUrl;
}
