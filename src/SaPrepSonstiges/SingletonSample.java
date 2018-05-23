package SaPrepSonstiges;

public class SingletonSample {
    private static SingletonSample ourInstance = new SingletonSample();

    public static SingletonSample getInstance() {
        return ourInstance;
    }

    private SingletonSample() {
    }
}
