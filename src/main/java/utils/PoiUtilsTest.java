package utils;

import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import test1.WorkSheetDetail;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by sang on 2018/1/16.
 */
public class PoiUtilsTest {



    public static void exportEmp2Excel(List emps) {
        HttpHeaders headers = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.创建Excel文档
            HSSFWorkbook workbook = new HSSFWorkbook();
            //2.创建文档摘要
            workbook.createInformationProperties();
            //3.获取文档信息，并配置
            DocumentSummaryInformation dsi = workbook.getDocumentSummaryInformation();
            //3.1文档类别
            dsi.setCategory("员工信息");
            //3.2设置文档管理员
            dsi.setManager("可可可可");
            //3.3设置组织机构
            dsi.setCompany("XXX集团");
            //4.获取摘要信息并配置
            SummaryInformation si = workbook.getSummaryInformation();
            //4.1设置文档主题
            si.setSubject("员工信息表");
            //4.2.设置文档标题
            si.setTitle("员工信息");
            //4.3 设置文档作者
            si.setAuthor("XXX集团");
            //4.4设置文档备注
            si.setComments("备注信息暂无");
            //创建Excel表单
            HSSFSheet sheet = workbook.createSheet("XXX集团员工信息表");
            //创建日期显示格式
            HSSFCellStyle dateCellStyle = workbook.createCellStyle();
            dateCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
            //创建标题的显示样式
            HSSFCellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            //定义列的宽度
            sheet.setColumnWidth(0, 5 * 256);
            sheet.setColumnWidth(1, 12 * 256);
            sheet.setColumnWidth(2, 10 * 256);
            sheet.setColumnWidth(3, 5 * 256);
            sheet.setColumnWidth(4, 12 * 256);//第四列(出生日期那一列)的宽度为10个字符的宽度
            sheet.setColumnWidth(5, 20 * 256);
            sheet.setColumnWidth(6, 10 * 256);
            sheet.setColumnWidth(7, 10 * 256);
            sheet.setColumnWidth(8, 16 * 256);
            sheet.setColumnWidth(9, 12 * 256);
            sheet.setColumnWidth(10, 15 * 256);
            sheet.setColumnWidth(11, 20 * 256);
            sheet.setColumnWidth(12, 16 * 256);
            sheet.setColumnWidth(13, 14 * 256);
            sheet.setColumnWidth(14, 14 * 256);
            sheet.setColumnWidth(15, 12 * 256);
            sheet.setColumnWidth(16, 8 * 256);
            sheet.setColumnWidth(17, 16 * 256);
            sheet.setColumnWidth(18, 20 * 256);
            sheet.setColumnWidth(19, 12 * 256);
            sheet.setColumnWidth(20, 8 * 256);
            sheet.setColumnWidth(21, 25 * 256);
            sheet.setColumnWidth(22, 14 * 256);
            sheet.setColumnWidth(23, 12 * 256);
            sheet.setColumnWidth(24, 12 * 256);
            //5.设置表头
            HSSFRow headerRow = sheet.createRow(0);
            HSSFCell cell0 = headerRow.createCell(0);
            cell0.setCellValue("编号");
            cell0.setCellStyle(headerStyle);
            HSSFCell cell1 = headerRow.createCell(1);
            cell1.setCellValue("姓名");
            cell1.setCellStyle(headerStyle);
            HSSFCell cell2 = headerRow.createCell(2);
            cell2.setCellValue("工号");
            cell2.setCellStyle(headerStyle);
            HSSFCell cell3 = headerRow.createCell(3);
            cell3.setCellValue("性别");
            cell3.setCellStyle(headerStyle);
            HSSFCell cell4 = headerRow.createCell(4);
            cell4.setCellValue("出生日期");
            cell4.setCellStyle(headerStyle);
            HSSFCell cell5 = headerRow.createCell(5);
            cell5.setCellValue("身份证号码");
            cell5.setCellStyle(headerStyle);
            HSSFCell cell6 = headerRow.createCell(6);
            cell6.setCellValue("婚姻状况");
            cell6.setCellStyle(headerStyle);
            HSSFCell cell7 = headerRow.createCell(7);
            cell7.setCellValue("民族");
            cell7.setCellStyle(headerStyle);
            HSSFCell cell8 = headerRow.createCell(8);
            cell8.setCellValue("籍贯");
            cell8.setCellStyle(headerStyle);
            HSSFCell cell9 = headerRow.createCell(9);
            cell9.setCellValue("政治面貌");
            cell9.setCellStyle(headerStyle);
            HSSFCell cell10 = headerRow.createCell(10);
            cell10.setCellValue("电话号码");
            cell10.setCellStyle(headerStyle);
            HSSFCell cell11 = headerRow.createCell(11);
            cell11.setCellValue("联系地址");
            cell11.setCellStyle(headerStyle);
            HSSFCell cell12 = headerRow.createCell(12);
            cell12.setCellValue("所属部门");
            cell12.setCellStyle(headerStyle);
            HSSFCell cell13 = headerRow.createCell(13);
            cell13.setCellValue("职称");
            cell13.setCellStyle(headerStyle);
            HSSFCell cell14 = headerRow.createCell(14);
            cell14.setCellValue("职位");
            cell14.setCellStyle(headerStyle);
            HSSFCell cell15 = headerRow.createCell(15);
            cell15.setCellValue("聘用形式");
            cell15.setCellStyle(headerStyle);
            HSSFCell cell16 = headerRow.createCell(16);
            cell16.setCellValue("最高学历");
            cell16.setCellStyle(headerStyle);
            HSSFCell cell17 = headerRow.createCell(17);
            cell17.setCellValue("专业");
            cell17.setCellStyle(headerStyle);
            HSSFCell cell18 = headerRow.createCell(18);
            cell18.setCellValue("毕业院校");
            cell18.setCellStyle(headerStyle);
            HSSFCell cell19 = headerRow.createCell(19);
            cell19.setCellValue("入职日期");
            cell19.setCellStyle(headerStyle);
            HSSFCell cell20 = headerRow.createCell(20);
            cell20.setCellValue("在职状态");
            cell20.setCellStyle(headerStyle);
            HSSFCell cell21 = headerRow.createCell(21);
            cell21.setCellValue("邮箱");
            cell21.setCellStyle(headerStyle);
            HSSFCell cell22 = headerRow.createCell(22);
            cell22.setCellValue("合同期限(年)");
            cell22.setCellStyle(headerStyle);
            HSSFCell cell23 = headerRow.createCell(23);
            cell23.setCellValue("合同起始日期");
            cell23.setCellStyle(headerStyle);
            HSSFCell cell24 = headerRow.createCell(24);
            cell24.setCellValue("合同终止日期");
            cell24.setCellStyle(headerStyle);
            //6.装数据
            for (int i = 0; i < emps.size(); i++) {
                HSSFRow row = sheet.createRow(i + 1);

            }
            headers = new HttpHeaders();
            headers.setContentDispositionFormData("attachment", new String("员工表.xls".getBytes("UTF-8"), "iso-8859-1"));
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            baos = new ByteArrayOutputStream();
            FileOutputStream fout = new FileOutputStream("D:/students.xls");
            workbook.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.CREATED);
    }

    public void getValue(List<WorkSheetDetail> userList, FileOutputStream fout){
        try{
            //1.创建工作簿
            HSSFWorkbook workbook = new HSSFWorkbook();
            //1.1创建合并单元格对象
            CellRangeAddress callRangeAddress = new CellRangeAddress(0,0,0,7);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress1 = new CellRangeAddress(1,1,0,7);//起始行,结束行,起始列,结束列
            //班组与时间start
            CellRangeAddress callRangeAddress20 = new CellRangeAddress(2,2,0,2);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress21 = new CellRangeAddress(2,2,3,4);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress22 = new CellRangeAddress(2,2,5,7);//起始行,结束行,起始列,结束列
            //班组与时间end

            //标题
            CellRangeAddress callRangeAddress31 = new CellRangeAddress(3,4,0,0);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress32 = new CellRangeAddress(3,4,1,1);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress33 = new CellRangeAddress(3,4,2,2);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress34 = new CellRangeAddress(3,3,3,4);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress35 = new CellRangeAddress(3,4,5,5);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress36 = new CellRangeAddress(3,4,6,6);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddress37 = new CellRangeAddress(3,4,7,7);//起始行,结束行,起始列,结束列

            //金额
            CellRangeAddress callRangeAddressnumber1 = new CellRangeAddress(userList.size()+5,userList.size()+5,0,2);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddressnumber2 = new CellRangeAddress(userList.size()+5,userList.size()+5,3,7);//起始行,结束行,起始列,结束列

            //负责人
            CellRangeAddress callRangeAddressPersion1 = new CellRangeAddress(userList.size()+6,userList.size()+6,0,2);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddressPersion2 = new CellRangeAddress(userList.size()+6,userList.size()+6,3,4);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddressPersion3 = new CellRangeAddress(userList.size()+6,userList.size()+6,5,7);//起始行,结束行,起始列,结束列

            //说明
            CellRangeAddress callRangeAddressinfo = new CellRangeAddress(userList.size()+7,userList.size()+7,0,7);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddressinfo1 = new CellRangeAddress(userList.size()+8,userList.size()+8,0,7);//起始行,结束行,起始列,结束列
            CellRangeAddress callRangeAddressinfo2 = new CellRangeAddress(userList.size()+9,userList.size()+9,0,7);//起始行,结束行,起始列,结束列

            //部项目经理部
            HSSFCellStyle headStyle = createCellStyle(workbook,(short)10,false,true);
            //派工单
            HSSFCellStyle erStyle = createCellStyle(workbook,(short)13,true,true);
            //班组和时间
            HSSFCellStyle sanStyle = createCellStyle(workbook,(short)10,false,false);
            //标题样式
            HSSFCellStyle colStyle = createCellStyle(workbook,(short)10,true,true);
            //内容样式
            HSSFCellStyle cellStyle = createCellStyle(workbook,(short)10,false,true);
            //2.创建工作表
            HSSFSheet sheet = workbook.createSheet("派单");
            //2.1加载合并单元格对象
            sheet.addMergedRegion(callRangeAddress);
            sheet.addMergedRegion(callRangeAddress1);
            sheet.addMergedRegion(callRangeAddress20);
            sheet.addMergedRegion(callRangeAddress21);
            sheet.addMergedRegion(callRangeAddress22);
            sheet.addMergedRegion(callRangeAddress31);
            sheet.addMergedRegion(callRangeAddress32);
            sheet.addMergedRegion(callRangeAddress33);
            sheet.addMergedRegion(callRangeAddress34);
            sheet.addMergedRegion(callRangeAddress35);
            sheet.addMergedRegion(callRangeAddress36);
            sheet.addMergedRegion(callRangeAddress37);
            sheet.addMergedRegion(callRangeAddressnumber1);
            sheet.addMergedRegion(callRangeAddressnumber2);
            sheet.addMergedRegion(callRangeAddressPersion1);
            sheet.addMergedRegion(callRangeAddressPersion2);
            sheet.addMergedRegion(callRangeAddressPersion3);
            sheet.addMergedRegion(callRangeAddressinfo);
            sheet.addMergedRegion(callRangeAddressinfo1);
            sheet.addMergedRegion(callRangeAddressinfo2);
            //设置默认列宽
            sheet.setDefaultColumnWidth(15);
            //3.创建行
            //3.1创建头标题行;并且设置头标题
            HSSFRow row = sheet.createRow(0);
            HSSFCell cell = row.createCell(0);
            //加载单元格样式
            cell.setCellStyle(headStyle);
            cell.setCellValue("xxxx项目部");

            HSSFRow rower = sheet.createRow(1);
            HSSFCell celler = rower.createCell(0);
            //加载单元格样式
            celler.setCellStyle(erStyle);
            celler.setCellValue("派 工 单");

            HSSFRow rowsan = sheet.createRow(2);
            HSSFCell cellsan = rowsan.createCell(0);
            HSSFCell cellsan1 = rowsan.createCell(3);
            HSSFCell cellsan2 = rowsan.createCell(5);
            //加载单元格样式
            cellsan.setCellStyle(sanStyle);
            cellsan.setCellValue("协作单位：x施工一堆");
            cellsan1.setCellStyle(sanStyle);
            cellsan1.setCellValue("");
            cellsan2.setCellStyle(sanStyle);
            cellsan2.setCellValue("时间：2017年 10月 20日");

            //3.2创建列标题;并且设置列标题
            HSSFRow row2 = sheet.createRow(3);
            String[] titles = {"序号","工作内容","用工总人数","工日数","","单价（元）","金额(元）","备注"};//""为占位字符串
            for(int i=0;i<titles.length;i++)
            {
                HSSFCell cell2 = row2.createCell(i);
                //加载单元格样式
                cell2.setCellStyle(colStyle);
                cell2.setCellValue(titles[i]);
            }

            HSSFRow rowfour = sheet.createRow(4);
            String[] titlefour = {"普工用工数","技工用工数"};
            for(int i=0;i<titlefour.length;i++)
            {
                HSSFCell cell2 = rowfour.createCell(i+3);
                //加载单元格样式
                cell2.setCellStyle(colStyle);
                cell2.setCellValue(titlefour[i]);
            }


            //4.操作单元格;将用户列表写入excel
            if(userList != null)
            {
                int i=1;
                for(int j=0;j<userList.size();j++)
                {
                    //创建数据行,前面有两行,头标题行和列标题行
                    HSSFRow row3 = sheet.createRow(j+5);
                    HSSFCell cell0 = row3.createCell(0);
                    cell0.setCellStyle(cellStyle);
                    cell0.setCellValue(i++);

                    HSSFCell cell1 = row3.createCell(1);
                    cell1.setCellStyle(cellStyle);
                    cell1.setCellValue(userList.get(j).getWorkCtx());

                    HSSFCell cell2 = row3.createCell(2);
                    cell2.setCellStyle(cellStyle);
                    cell2.setCellValue(userList.get(j).getTotalHumanDays());

                    HSSFCell cell3 = row3.createCell(3);
                    cell3.setCellStyle(cellStyle);
                    cell3.setCellValue(userList.get(j).getGwnNum());

                    HSSFCell cell4 = row3.createCell(4);
                    cell4.setCellStyle(cellStyle);
                    cell4.setCellValue(userList.get(j).getTmnNum());

                    HSSFCell cell5 = row3.createCell(5);
                    cell5.setCellStyle(cellStyle);
                    cell5.setCellValue(userList.get(j).getTotalHumanDays());

                    HSSFCell cell6 = row3.createCell(6);
                    cell6.setCellStyle(cellStyle);
                    cell6.setCellValue(userList.get(j).getUnitAmount());

                    HSSFCell cell7= row3.createCell(7);
                    cell7.setCellStyle(cellStyle);
                    cell7.setCellValue(userList.get(j).getUnitPrice());
                }
            }

            HSSFRow rownumber = sheet.createRow(userList.size()+5);
            HSSFCell cellnumber = rownumber.createCell(0);
            HSSFCell cellnumber1 = rownumber.createCell(3);
            //加载单元格样式
            cellnumber.setCellStyle(sanStyle);
            cellnumber.setCellValue("金额合计(大写)");
            cellnumber1.setCellStyle(sanStyle);
            cellnumber1.setCellValue("￥ 78 元； 大写：柒拾捌元整");

            HSSFRow rowpersion = sheet.createRow(userList.size()+6);
            HSSFCell cellpersion = rowpersion.createCell(0);
            HSSFCell cellpersion1 = rowpersion.createCell(3);
            HSSFCell cellpersion2 = rowpersion.createCell(5);

            //加载单元格样式
            cellpersion.setCellStyle(sanStyle);
            cellpersion.setCellValue("协作单位负责人：");
            cellpersion1.setCellStyle(sanStyle);
            cellpersion1.setCellValue("经办人：");
            cellpersion2.setCellStyle(sanStyle);
            cellpersion2.setCellValue("部门负责人：");

            HSSFRow rowinfo = sheet.createRow(userList.size()+7);
            HSSFCell cellinfo = rowinfo.createCell(0);
            cellinfo.setCellStyle(sanStyle);
            cellinfo.setCellValue("说明：1、本标工单一式两联，第一联为派工人（工长）存根，第二联用作结算。");

            HSSFRow rowinfo1 = sheet.createRow(userList.size()+8);
            HSSFCell cellinfo1 = rowinfo1.createCell(0);
            cellinfo1.setCellStyle(sanStyle);
            cellinfo1.setCellValue("2、本标工单必须在用工当日签认，否则不予认可；三日内交合同处汇总。");

            HSSFRow rowinfo2 = sheet.createRow(userList.size()+9);
            HSSFCell cellinfo2 = rowinfo2.createCell(0);
            cellinfo2.setCellStyle(sanStyle);
            cellinfo2.setCellValue("3、工日数填写精确到半个工日。");
            //5.输出
            workbook.write(fout);
//	            workbook.close();
            //out.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static HSSFCellStyle createCellStyle(HSSFWorkbook workbook, short fontsize,boolean flag,boolean flag1) {
        // TODO Auto-generated method stub
        HSSFCellStyle style = workbook.createCellStyle();
        //是否水平居中
        if(flag1){
//            style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中
        }

//        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中
        //创建字体
        HSSFFont font = workbook.createFont();
        //是否加粗字体
        if(flag){
//            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        }
        font.setFontHeightInPoints(fontsize);
        //加载字体
        style.setFont(font);
        return style;
    }


}
