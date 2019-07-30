package cn.kingcar.risk.api.dto;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrderCreditRiskDTO implements Serializable {
    private static final long serialVersionUID = -8951078272866205662L;
    private String businessSource;
    private String businessNo;
    private String notifyUrl;
    private String conclution;
    private String description;
    private String modelName;
    private List<OrderRiskNotifyDetailDTO> detailList;
    private List<OrderCompensateMaterialDTO> orderCompensateMaterialDTOList;
}
