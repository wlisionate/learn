package com.pcb.common;

import java.io.*;

public class FileUtil {
    /**
     * 读文件
     * @param filePath
     * @return
     */
    public static String readFile(String filePath){
        try(FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            StringBuffer sb = new StringBuffer();
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                sb.append(line);
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 写文件
     * @param filePath
     * @param content
     */
    public static void writeFile(String filePath,String content){
        try(FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
