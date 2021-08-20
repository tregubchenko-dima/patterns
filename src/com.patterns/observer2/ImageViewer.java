package com.patterns.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ImageViewer implements Observer {

    private List<String> articles;

    public ImageViewer(){
        articles = new ArrayList<>();
    }

    @Override
    public void update(Observable o, Object arg) {
        articles.add(arg.toString());
        System.out.println(arg);
    }
}
