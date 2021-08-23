package com.patterns.command;

public class CommandTest {

    public static void main(String[] args){
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        TextFile textFile = new TextFile("file.txt");
        System.out.println(executor.executeOperation(new OpenFile(textFile)));
        System.out.println(executor.executeOperation(new SaveFile(textFile)));
    }
}
