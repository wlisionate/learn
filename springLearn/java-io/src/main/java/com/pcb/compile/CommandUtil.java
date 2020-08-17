package com.pcb.compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CommandUtil {
    public static void run(String cmd,String fileLoad) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(cmd);
        InputStream is = process.getErrorStream();
        OutputStream os = new FileOutputStream(fileLoad);
        int ch = -1;
        while ((ch = is.read()) != -1){
            os.write(ch);
        }
        os.close();
        is.close();
        process.waitFor();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        run("javac","f:/test.txt");
    }
}
