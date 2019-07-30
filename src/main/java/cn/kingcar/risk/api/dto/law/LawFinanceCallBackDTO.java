package cn.kingcar.risk.api.dto.law;

import lombok.Data;

import java.io.Serializable;

@Data
public class LawFinanceCallBackDTO implements Serializable {

    /**
     * 财务对接流水号
     */
    private String dockGenerateFlowNo;


    /**
     * 财务返回收到的金额
     */
    private String reciveMoney;


    /**
     * 财务当前批次审核结果
     */
    private String financeStatus;

}
