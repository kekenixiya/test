package cn.kingcar.risk.api.service;

import cn.kingcar.risk.api.dto.*;
import cn.kingcar.risk.api.dto.common.RiskResultDTO;

import java.util.List;

/**
 * @ProjectName: kc-risk
 * @Package: cn.kingcar.risk.api.service
 * @Author: San
 * @CreateDate: 2018/4/26 15:20
 * @Description: 风控对外服务操作接口
 */
public interface RiskService {

    /**
     * 风控对外服务操作接口
     * @param riskSubmitDTO 风控参数
     * @return 返回结果集
     */
    RiskResultDTO<RiskSubmitResultDTO> riskControl(RiskSubmitDTO riskSubmitDTO);

    /**
     * 风控查询申请
     * @param riskQueryInfoDTO 查询参数DTO
     * @return 返回结果集
     */
    RiskResultDTO<List<RiskQueryBackDTO>> riskQueryApply(RiskQueryInfoDTO riskQueryInfoDTO);

    /**
     * 风控引擎调用前检测
     * @param riskQueryInfoDTO 查询参数DTO
     * @return 返回结果集
     */
     RiskResultDTO<List<RiskQueryDetailDTO>> riskEngineInvokeBeforeAction(RiskQueryInfoDTO riskQueryInfoDTO);

    /**
     * 根据源业务单号和新业务单号更新风控系统中的对应业务单号
     * @param sourceBusinessNo 源业务单号
     * @param targetBusinessNo 目标业务单号
     * @return 返回结果集
     */
    RiskResultDTO<Boolean> riskReplaceBusinessNo(String sourceBusinessNo, String targetBusinessNo);

    /**
     * 根据业务系统订单号获取风控详情
     * @param businessNo 业务单号
     * @return 风控详情结果集
     */
    RiskResultDTO<BizOrderResponseDTO> queryRiskDetailByBusinessNo(String businessNo);


    /**
     * 业务系统材料验证提交
     * @param materialValidateApiDTOList 业务系统提价材料验证包装对象
     * @return 返回结果集
     */
    RiskResultDTO<Boolean> riskMaterialValidate(List<MaterialValidateApiDTO> materialValidateApiDTOList);

}
