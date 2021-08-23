package com.patterns.command;

public class TextFile {

    private String name;

    public TextFile(String name){
        this.name = name;
    }

    public String openFile(){
        return "Opening " + name;
    }

    public String saveFile(){
        return "Saving " + name;
    }
}
