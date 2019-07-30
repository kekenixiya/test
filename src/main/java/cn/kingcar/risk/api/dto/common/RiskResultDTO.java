package cn.kingcar.risk.api.dto.common;


import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto.common
 * @Author: San
 * @CreateDate: 2018/4/26 15:16
 * @Description: 通用返回结果集
 */
@Data
public class RiskResultDTO<T> implements Serializable{

    private static final long serialVersionUID = 914115139110236006L;

    private Boolean flag;

    private T  data;

    private String errorMessage;

    private String statusCode;

}
