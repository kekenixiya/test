package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto.common
 * @Author: San
 * @CreateDate: 2018/11/2
 * @Description: desc
 */
@Data
public class BizOrderResponseDTO implements Serializable {

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 业务单号
     */
    private String businessNo;

    /**
     * 资金来源编码
     */
    private String capitalSource;

    /**
     * 地区编码
     */
    private String areaCode;

    /**
     * 贷款金额
     */
    private BigDecimal loanFee;

    /**
     * 车型
     */
    private String carModel;

    /**
     * INIT("初始化","INIT"),
     NOT_PASS("不通过","NOT_PASS"),
     PASS("通过","PASS"),
     MANUAL("人工介入","MANUAL"),
     FAIL("操作失败","FAIL"),
     WAIT_MIDBANK_REPORT("待上传央行征信","WAIT_MIDBANK_REPORT"),
     BREAK_OFF("中止","BREAK_OFF"),
     */
    private String status;

    /**
     * 模型id
     */
    private Integer modelId;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 还款期数
     */
    private Integer stage;

    /**
     * 金融方案id
     */
    private Integer schemeId;

    /**
     * 金融方案名称
     */
    private String schemeName;

    /**
     * 结果描述
     */
    private String description;

    /**
     * 车商id
     */
    private Integer carOrgId;

    /**
     * 车商名称
     */
    private String carOrgName;

    /**
     * 人员记录列表
     */
    private List<RiskRecordInfoDTO> userRecordList;

}
