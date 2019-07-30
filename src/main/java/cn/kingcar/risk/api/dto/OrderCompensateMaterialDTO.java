package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderCompensateMaterialDTO implements Serializable {
    private static final long serialVersionUID = -134633001035916307L;
    private String materialCode;
    private String materialName;
}
