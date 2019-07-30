package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto.common
 * @Author: San
 * @CreateDate: 2018/6/14 16:47
 * @Description: 风控查询申请DTO
 */
@Data
public class RiskQueryInfoDTO implements Serializable {

    private static final long serialVersionUID = -4599273431689397047L;

    /**
     * 业务单号
     */
    private String businessNo;

    /**
     * 业务类型
     */
    private String businessType;

    /**
     * 业务来源
     */
    private String businessSource;

    /**
     *  资金来源类型
     */
    private String capitalSource;

    /**
     * 网点编号
     */
    private String capitalNetCode;

    /**
     * 地区编码
     */
    private String areaCode;

    /**
     * 通知地址
     */
    private String notifyUrl;

    /**
     * 条件  所有人必须全部通过AND  所有人全部选过OR
     */
    private String condition;

    /**
     * 意向贷款金额
     */
    private BigDecimal loanFee;

    /**
     * 车型
     */
    private String carModel;

    /**
     * 还款期数
     */
    private Integer  stage;

    /**
     * 车商ID
     */
    private Integer  carOrgId;

    /*
     * 车商名称
     */
    private String   carOrgName;

    /**
     * 车商编码类型
     */
    private String carOrgTypeCode;

    /**
     * 金融方案id
     */
    private Integer schemeId;

    /**
     * 金融方案名称
     */
    private String schemeName;

    /**
     * 人员列表
     */
    private List<RiskQueryDetailDTO> detailList;

    /**
     *资金方
     */
    private List<RiskQueryCapitalDTO> capitalList;

    //============   查询发起人信息 发起人id 姓名 部门名称  =========
    /**
     * 查询发起人id
     */
    private Integer queryerId;

    /**
     * 查询发起人姓名
     */
    private String queryerName;

    /**
     * 查询发起人部门名称
     */
    private String queryerDept;

    /**
     * 查询发起人部门编码
     */
    private String queryerDeptCode;

    /**
     * 大区编码
     */
    private String areaBigCode;

    /**
     * 大区名称
     */
    private String areaBigName;

}
