package com.ljg.others;

import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

import static com.ljg.JsonToExcel.readJson;

/**
 * 可以json转excel  完美实现
 */
public class Json2Excel {

    public Json2Excel() {
    }

    public static void build(OutputStream output, String json, String[] properties) {
        build(output, json, properties, properties);
    }

    public static void build(OutputStream output, String json, String[] properties, String[] columnsNames) {
        HSSFWorkbook libro = new HSSFWorkbook();
        HSSFSheet hoja = libro.createSheet();
        HSSFRow header = hoja.createRow(0);
        JSONArray array = new JSONArray(json);

        for (int j = 0; j < columnsNames.length; ++j) {
            String object = columnsNames[j];
            HSSFCell row = header.createCell(j);
            HSSFRichTextString hssfRichTextString = new HSSFRichTextString(object);
            row.setCellValue(hssfRichTextString);
        }

        for (int k = 0; k < array.length(); ++k) {
            JSONObject jsonObject = array.getJSONObject(k);
            HSSFRow row = hoja.createRow(k + 1);
            for (int i = 0; i < properties.length; ++i) {
                String string = properties[i];
                HSSFCell cell = row.createCell(i);
                try {
                    Object obj = "";
                    try {
                        obj = jsonObject.get(string);
                    } catch (JSONException e) {
                        obj = "";
                    }
                    HSSFRichTextString text = new HSSFRichTextString(obj.toString());
                    cell.setCellValue(text);
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        }
        try {
            libro.write(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        FileOutputStream xlsStream = null;
        try {
            /*reader = new FileReader(new File("C:\\Users\\lijianguo\\Desktop\\document.json"));
            bufferedReader = new BufferedReader(reader);
            String line = null;
            StringBuffer stringBuffer = new StringBuffer();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }*/
            String stringBuffer = readJson("C:\\Users\\lijianguo\\Desktop\\nifty_survey.json");
            xlsStream = new FileOutputStream("C:\\Users\\lijianguo\\Desktop\\nifty_survey.xls");
            Json2Excel.build(xlsStream, stringBuffer, new String[]{"DNATestingOtherReason", "DNATestingPrice", "DNATestingPriceEVal", "DNATestingReason",
                    "amniocentesisAndCordBloodCheck", "amniocentesisAndCordBloodDesc", "amniocentesisAndCordBloodStatus", "appearanceAbnormalDesc",
                    "appearanceAbnormalDescOther", "birthPlace", "bloodPressure", "bloodTime", "bodyAbnormalDesc", "bodyAbnormalDescOther", "cesareanSectionReason",
                    "checkEvaluate", "childAppearanceStatus", "childBirthday", "childBodyStatus", "childGendar", "childWeight", "createTime", "deliveryMode", "examineName",
                    "m_age", "m_weight", "m_height", "m_bloodType", "f_age", "f_weight", "f_height", "f_bloodType", "b_age", "b_weight", "b_height", "b_bloodType",
                    "gestationalAge", "hearingResult", "hearingResultDetail", "heartCheckResult", "heartCheckResultDetail", "heartRate", "heelBloodResult", "heelBloodResultDetail",
                    "idCard", "invoiceFlag", "isBorn", "notInvoiceReason", "notSatisfiedDetail", "notSatisfiedEarly", "notSatisfiedLate", "notSatisfiedMid", "obtainInfoSource",
                    "obtainInfoSourceOther", "payConvenientStatus", "payType", "phoneNumber", "pregnancyComplicationsDesc", "pregnancyComplicationsOtherDetail", "pregnancyComplicationsStatus",
                    "recommendProbability", "sampleNum", "samplingHospital", "stopPregnancy", "stopPregnancyDesc", "tireNumber", "transferMoneyDetail", "userCity", "userNation",
                    "userSuggestion"});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(xlsStream);
            IOUtils.closeQuietly(bufferedReader);
            IOUtils.closeQuietly(reader);
        }

    }
}