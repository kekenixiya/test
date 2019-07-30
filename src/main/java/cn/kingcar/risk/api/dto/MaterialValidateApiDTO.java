package cn.kingcar.risk.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class MaterialValidateApiDTO implements Serializable {
    private static final long serialVersionUID = -1831054046160015474L;
//    /**
//     * 主键
//     */
//    private Integer id;

    /**
     * 业务单号
     */
    private String businessNo;

    /**
     * API流水号
     */
    private String apiNo;

    /**
     * 材料类型  驾驶证 购车发票
     */
    private String materialType;

    /**
     * 材料名称   附件名称
     */
    private String materialName;

    /**
     * 材料上传地址
     */
    private List<String> materialUrlList;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户身份证号
     */
    private String userIdNo;

    /**
     * 查询结果  真 伪
     */
    private String queryResult;

    /**
     * 查询返回参数
     */
    private String returnParam;

    /**
     * 处理状态  等待查询结果  等待处理  已处理  无需处理
     */
    private String handleStatus;

    /**
     * 状态 查询中  已查询
     */
    private String status;

    /**
     * 是否删除y/n
     */
    private String isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Integer createUser;

    /**
     *  图片内容数组
     */
//    private byte[] picBytes;
}
