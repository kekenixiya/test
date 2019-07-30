package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto
 * @Author: San
 * @CreateDate: 2018/4/26 15:18
 * @Description: 风控对外API返回DTO
 */
@Data
public class RiskSubmitResultDTO implements Serializable {


    private static final long serialVersionUID = 134795668341403629L;

    /**
     * 风控流水号
     */
    private String riskNo;

    /**
     * 是否需要等待通知
     */
    private Boolean waitNotify;

    /**
     * 风控结论
     */
    private String conclusion;

    /**
     * 风控模型
     */
    private String riskModel;

    /**
     * 结论描述
     */
    private String description;


}
