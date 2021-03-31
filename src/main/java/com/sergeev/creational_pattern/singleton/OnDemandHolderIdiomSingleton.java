package main.java.com.sergeev.creational_pattern.singleton;

public class OnDemandHolderIdiomSingleton {

    public static class SingletonHolder {
        public static final OnDemandHolderIdiomSingleton HOLDER_INSTANCE = new OnDemandHolderIdiomSingleton();
    }

    public static OnDemandHolderIdiomSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
