package com.pcb.compile;

public class Task {
    //临时文件都放到tmp中
    private static final String WORK_DIR = "./tmp/";
    private static final String CLASS = "Solution";
    private static final String CODE =WORK_DIR+ "Solution.java";
    private static final String STDIN = WORK_DIR+"stdin.txt";
    private static final String STDOUT = WORK_DIR+"stdout.txt";
    private static final String STDERR = WORK_DIR+"stderr.txt";
    private static final String COMPILE_ERROR =WORK_DIR+ "compile_error.txt";


    public Answer compileAndRun(Question question){
        
        return null;
    }
}
