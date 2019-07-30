package com.aa.bb.cc;

import lombok.Data;

/**
 * Excel解析返回
 * @author yushuangyang
 * @date 2019年7月12日
 */
@Data
public class LawAnalysisColumnResultDTO {
    /**
     * 列名称
     */
    private String columnName = "列名";
    /**
     * 列位置
     */
    private int columnIndex = 0;
}
