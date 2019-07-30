package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @Description:
 * @Author:
 */

@Data
public class RiskNotifyDetailDTO {

    private static final long serialVersionUID = 3119732542572479560L;
    /**
     * 姓名
     */
    private String userName;

    /**
     * 身份证号码
     */
    private String idNo;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 意向贷款金额
     */
    private BigDecimal loanFee;

    /**
     * 描述
     */
    private String description;

    /**
     * 结论
     */
    private String conclusion;

    /**
     * 模型
     */
    private String modelName;

}
