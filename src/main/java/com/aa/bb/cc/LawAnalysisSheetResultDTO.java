package com.aa.bb.cc;

import lombok.Data;

import java.util.List;

/**
 * 新版导入解析工作表
 * @author yushuangyang
 * @date 2019年7月12日
 */
@Data
public class LawAnalysisSheetResultDTO {
    /**
     * Excel sheet名称
     */
    private String sheetNmae = "sheet名";
    /**
     * Excel sheet索引
     */
    private int sheetIndex = -1;
    /**
     * 起始行
     */
    private int initialCow = -1;
    /**
     * 结束行
     */
    private int finishCow = -1;
    /**
     * 工作表属性
     */
    private List<LawAnalysisColumnResultDTO> lawAnalysisColumnResultDTOS;
}
