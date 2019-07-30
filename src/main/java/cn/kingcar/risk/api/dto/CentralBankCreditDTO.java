package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto.common
 * @Author: San
 * @CreateDate: 2018/11/2
 * @Description: 央行征信结果DTO
 */
@Data
public class CentralBankCreditDTO implements Serializable {

    /**
     * 央行征信报告编号id
     */
    private String creditResultId;

    /**
     * 个人征信查询结果
     */
    private String creditResultValue;

    /**
     * 状态:通过PASS_YES 未通过PASS_NO 关注PASS_WATCH
     */
    private String conclusion;

    /**
     * 历史贷款逾期总数(次)
     */
    private Integer hisLoanTimeoutTimes;

    /**
     *  历史信用卡逾期总数(次)
     */
    private Integer hisCreditCardTimeoutTimes;

    /**
     * 我行专项卡分期笔数(笔)
     */
    private Integer specialCardInstallmentTimes;

    /**
     * 未结清余额(元)
     */
    private BigDecimal noSettlementMoney;

    /**
     * 备注
     */
    private String remark;

}
