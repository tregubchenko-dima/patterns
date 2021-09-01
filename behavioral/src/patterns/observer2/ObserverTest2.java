package patterns.observer2;

import java.util.Observer;

public class ObserverTest2 {

    public static void main(String[] args){

        Journal journal = new Journal();
        Observer userDima = new ImageViewer();
        Observer userPavel = new NewsReader();

        journal.addObserver(userDima);
        journal.addObserver(userPavel);

        journal.setArticle("Observer, part 2");

        journal.deleteObserver(userDima);

        journal.setArticle("Dima left...");
    }
}
