package com.patterns.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Journal extends Observable {

    private List<String> articles;

    public Journal(){
        articles = new ArrayList<>();
    }

    public void setArticle(String article){
        if(!article.isEmpty()) {
            articles.add(article);
            setChanged();
            notifyObservers(article);
        }
    }
}
