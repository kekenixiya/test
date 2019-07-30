package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto
 * @Author: San
 * @CreateDate: 2018/11/2
 * @Description: 风控记录信息DTO 用于查询返回
 */
@Data
public class RiskRecordInfoDTO implements Serializable {

    /**
     * 风控单号
     */
    private String riskNo;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 身份证号
     */
    private String idNo;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 贷款意向
     */
    private BigDecimal loanIntention;

    /**
     * 借款人类型
     */
    private String borrowerType;

    /**
     * 关系  本人、配偶、子女、父母
     */
    private String relation;

    /**
     * 结论
     */
    private String conclusion;

    /**
     * 性别
     */
    private String personSex;

    /**
     * 用户年龄
     */
    private Integer personAge;

    /**
     * 手机号在网时长
     */
    private String personPhoneOnlineMonth;

    /**
     * 工作类型
     */
    private String personJob;

    /**
     * 工作单位
     */
    private String personJobCompany;

    /**
     * 工作年限
     */
    private String personJobTimeYear;

    /**
     * 工作薪水估计
     */
    private String personJobProbablySalary;

    /**
     * 户籍所在地
     */
    private String personRegisterHouse;

    /**
     * 社保缴纳单位
     */
    private String personSocialCompany;

    /**
     * 最后一个月的缴纳的社保金额
     */
    private String personSocialLastmonthMoney;

    /**
     * 央行征信结果
     */
    private CentralBankCreditDTO centralBankCredit;

}
