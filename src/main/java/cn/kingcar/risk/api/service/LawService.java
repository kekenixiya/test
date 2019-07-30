package cn.kingcar.risk.api.service;

import cn.kingcar.risk.api.dto.common.RiskResultDTO;
import cn.kingcar.risk.api.dto.law.LawFinanceCallBackDTO;

public interface LawService {
    /**
     * 法务财务对外服务操作接口
     * @param LawFinanceCallBackDTO 法务回调参数
     * @return 返回结果集
     */
    RiskResultDTO<Boolean> lawFinanceResultReturn(LawFinanceCallBackDTO lawFinanceCallBackDTO);
}
