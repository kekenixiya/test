package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @Description:
 * @Author:
 */

@Data
public class RiskNotifyQueryInfoDTO implements Serializable {

    private static final long serialVersionUID = 3119732542572479560L;


    /**
     * 业务来源
     */
    private String businessSource;

    /**
     * 业务单号
     */
    private String businessNo;

    /**
     * 通知地址
     */
    private String notifyUrl;

    /**
     * 结论
     */
    private String conclution;

    /**
     * 人员列表
     */
    private List<RiskNotifyDetailDTO> detailList;
}
