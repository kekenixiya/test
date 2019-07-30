package com.aa.bb;

import com.aa.bb.cc.LawAnalysisColumnResultDTO;
import com.aa.bb.cc.LawAnalysisSheetResultDTO;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        LawAnalysisColumnResultDTO    lawAnalysisColumnResultDTO = new LawAnalysisColumnResultDTO();
        lawAnalysisColumnResultDTO.setColumnIndex(0);lawAnalysisColumnResultDTO.setColumnName("列0");
        LawAnalysisColumnResultDTO    lawAnalysisColumnResultDTO2 = new LawAnalysisColumnResultDTO();
        lawAnalysisColumnResultDTO.setColumnIndex(1);lawAnalysisColumnResultDTO.setColumnName("列1");
        LawAnalysisColumnResultDTO    lawAnalysisColumnResultDTO3 = new LawAnalysisColumnResultDTO();
        lawAnalysisColumnResultDTO.setColumnIndex(2);lawAnalysisColumnResultDTO.setColumnName("列2");

        List<LawAnalysisColumnResultDTO>  lawAnalysisColumnResultDTOS = new ArrayList<>();
        lawAnalysisColumnResultDTOS.add(lawAnalysisColumnResultDTO);lawAnalysisColumnResultDTOS.add(lawAnalysisColumnResultDTO2);
        lawAnalysisColumnResultDTOS.add(lawAnalysisColumnResultDTO3);

        LawAnalysisSheetResultDTO lawAnalysisSheetResultDTO1 = new LawAnalysisSheetResultDTO();
        lawAnalysisSheetResultDTO1.setLawAnalysisColumnResultDTOS(lawAnalysisColumnResultDTOS);

        LawAnalysisSheetResultDTO lawAnalysisSheetResultDTO2 = new LawAnalysisSheetResultDTO();
        lawAnalysisSheetResultDTO2.setLawAnalysisColumnResultDTOS(lawAnalysisColumnResultDTOS);


        List<LawAnalysisSheetResultDTO> lawAnalysisSheetResultDTOS = new ArrayList<>();
        lawAnalysisSheetResultDTOS.add(lawAnalysisSheetResultDTO1);
        lawAnalysisSheetResultDTOS.add(lawAnalysisSheetResultDTO2);
        System.out.println(JSON.toJSONString(lawAnalysisSheetResultDTOS));
    }
}
