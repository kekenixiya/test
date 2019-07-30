package cn.kingcar.risk.api.dto.law;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LawApplySettleDTO implements Serializable {

    /**
     * 业务单号
     */
    private String businessNo;

    /**
     * 结清申请人姓名
     */
    private String settleName;

    /**
     * 身份证号
     */
    private String settleCardId;

    /**
     * 申请人手机号
     */
    private String settlePhone;

    /**
     * 车型
     */
    private String carModel;

    /**
     * 车牌
     */
    private String carLicence;

    /**
     * 申请时间
     */
    private Date applyTime;
}
