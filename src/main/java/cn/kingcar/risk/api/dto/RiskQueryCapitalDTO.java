package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RiskQueryCapitalDTO implements Serializable {

    private static final long serialVersionUID = -2640558468846112727L;
    /**
     * 资金方类型
     */
    private String capitalType;

    /**
     * 资金方ID
     */
    private Integer capitalId;

    /**
     * 资金方名称
     */
    private String  capitalName;

}
