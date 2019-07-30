package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto.common
 * @Author: San
 * @CreateDate: 2018/6/14 19:21
 * @Description: 风控查询结果同步返回
 */
@Data
public class RiskQueryBackDTO implements Serializable {

    private static final long serialVersionUID = 6820353855588017181L;
    /**
     * 风控流水号
     */
    private String riskNo;

    /**
     * 身份证号码
     */
    private String idNo;

    /**
     * 业务单号
     */
    private String businessNo;
}
