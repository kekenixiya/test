package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.dto.common
 * @Author: San
 * @CreateDate: 2018/6/14 16:48
 * @Description: 风控查询申请详细数据DTO
 */
@Data
public class RiskQueryDetailDTO implements Serializable{

    private static final long serialVersionUID = 3119732542572479560L;
    /**
     * 姓名
     */
    private String userName;

    /**
     * 银行卡号
     */
    private String bankNo;

    /**
     * 身份证号码
     */
    private String idNo;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 借款人类型
     */
    private String borrowerType;

    /**
     * 关系  本人、配偶、子女、父母
     */
    private String relation;

    /**
     * 工作单位
     */
    private String personJobCompany;

    /**
     * 户籍所在地
     */
    private String personRegisterHouse;


    /**
     * 银行流水查询api查询号码
     */
    private String bankStatementApino;


    /*
     *个人图片集合 图片集合
     */
    private List<RiskQueryImageDTO> imageList;

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
    private Date  lastQueryTime;

    /**
     * 最近一次查询的报告
     */
    private Integer  lastQueryReportId;
}
