package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderRiskNotifyDetailDTO implements Serializable {
    private static final long serialVersionUID = 5975203843680375954L;
    private String userName;
    private String idNo;
    private String phone;
    private BigDecimal loanFee;
    private String description;
    private String conclusion;
    private String modelName;
    private List<OrderCompensateMaterialDTO> orderCompensateMaterialDTOList;
}
