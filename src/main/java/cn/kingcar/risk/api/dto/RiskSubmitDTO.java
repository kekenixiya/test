package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto
 * @Author: San
 * @CreateDate: 2018/4/26 15:18
 * @Description: 风控对外API入参DTO
 */
@Data
public class RiskSubmitDTO implements Serializable {

    private static final long serialVersionUID = -9185382678073629520L;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 身份证号码
     */
    private String idNo;

    /**
     * 借款人类型
     */
    private String borrowerType;

    /**
     * 银行卡号
     */
    private String bankNo;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 通知地址
     */
    private String notifyUrl;

    /**
     * 意向贷款金额
     */
    private BigDecimal loanFee;

    /**
     * 车型
     */
    private String carModel;

    /**
     * 业务来源
     */
    private String businessSource;

    /**
     * 业务单号
     */
    private String businessNo;

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
     * 地区编码
     */
    private String areaCode;


    //*****************  风控查询方法预检测使用属性 *******************
    /**
     * 当前一段时间内是否已经风控查询记录
     */
    private Boolean repetitionFlag ;

    /**
     *  单人在一段时间内已用大数据查询的次数
     */
    private Integer singlerQueryCountInTime;

    /**
     * 最近一次查询的时间
     */
    private Date lastQueryTime;

    /**
     * 最近一次查询的报告
     */
    private Integer  lastQueryReportId;
}
