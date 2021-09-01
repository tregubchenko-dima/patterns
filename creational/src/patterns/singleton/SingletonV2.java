package patterns.singleton;

public class SingletonV2 {

    private static final SingletonV2 singleton = new SingletonV2();

    private SingletonV2(){}

    public static SingletonV2 getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("MessageV2");
    }
}
