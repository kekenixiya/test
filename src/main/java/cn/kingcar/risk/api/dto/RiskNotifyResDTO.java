package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @Description:
 * @Author:
 */

@Data
public class RiskNotifyResDTO implements Serializable{

    private static final long serialVersionUID = 3119732542572479560L;


    private String businessNo;

    private String businessSource;

    private String userName;

    private String idNo;

    private String phone;

    private String description;

    private String conclusion;

    private String notifyUrl;

    private BigDecimal loanIntention;

    private Integer modelId;

}
