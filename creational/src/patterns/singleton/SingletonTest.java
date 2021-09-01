package patterns.singleton;

public class SingletonTest {

    public static void main(String[] args){

        SingletonV1 singletonV1 = SingletonV1.getInstance("test1");
        SingletonV1 singletonV11 = SingletonV1.getInstance("test2");
        singletonV1.showMessage();
        singletonV11.showMessage();

        SingletonV2 singletonV2 = SingletonV2.getInstance();
        SingletonV2 singletonV22 = SingletonV2.getInstance();
        singletonV2.showMessage();
        System.out.println(singletonV2.hashCode());
        System.out.println(singletonV22.hashCode());

        ThreadBar threadBar = new ThreadBar();
        ThreadFoo threadFoo = new ThreadFoo();

        threadBar.run();
        threadFoo.run();

    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonV1 singleton = SingletonV1.getInstance("V1");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonV1 singleton = SingletonV1.getInstance("V2");
            System.out.println(singleton.getValue());
        }
    }
}
