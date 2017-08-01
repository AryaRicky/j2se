package com.ljg;

import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lijianguo on 2017/8/1.
 */
public class JsonToExcel {

    public static String readJson(String path) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(path);
            bufferedReader = new BufferedReader(reader);
            String readLine = "";
            while ((readLine = bufferedReader.readLine()) != null) {
                String reg = "\\{\"\\$numberLong\":\"\\d+\"\\}";
                Pattern pattern = Pattern.compile(reg);
                Matcher matcher = pattern.matcher(readLine);
                if (matcher.find()) {
                    String str = matcher.group();
                    String tmp = str.split(":")[1];
                    tmp = tmp.substring(1, tmp.length() - 2);
                    String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date(Long.valueOf(tmp)));
                    readLine = readLine.replaceAll("\"createTime\":\\{\"\\$numberLong\":\"\\d+\"\\}", "\"createTime\":\"" + time + "\"");
                }
                readLine = familyStrHandle(readLine); //
                readLine = readLine.replaceAll(":,", ":\"\",");
                sb.append(readLine + ",\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(bufferedReader);
            IOUtils.closeQuietly(reader);
        }
        sb.append("]");
        return sb.toString();
    }

    private static String familyStrHandle(String input) {
        String reg = "\"familyMember\":.+\"gestationalAge\"";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(input);
        StringBuffer stringBuffer = new StringBuffer();
        if (matcher.find()) {
            String str = matcher.group();
            Pattern pattern2 = Pattern.compile("\\(.+?\\)");
            Matcher matcher2 = pattern2.matcher(str);
            while (matcher2.find()) {
                stringBuffer.append(matcher2.group().substring(1, matcher2.group().length() - 1) + ",");
            }
            return input.replaceAll(reg, stringBuffer.append("\"gestationalAge\"").toString());
        }
        return input;
    }

    public static void main(String[] args) {
        String str = readJson("C:\\Users\\lijianguo\\Desktop\\nifty_survey.json");
        System.out.println(str);
    }

}
