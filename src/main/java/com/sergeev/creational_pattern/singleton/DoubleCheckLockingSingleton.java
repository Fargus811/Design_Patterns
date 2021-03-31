package main.java.com.sergeev.creational_pattern.singleton;

public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    public static DoubleCheckLockingSingleton getInstance() {
        DoubleCheckLockingSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return localInstance;
    }
}
