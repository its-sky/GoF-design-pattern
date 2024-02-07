package creational_patterns.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private static Settings instance;

    private Settings() {}

    /**
     * getInstance가 호출될 때 SettingsHolder에 INSTANCE가 lazy laading이 되고
     * 복잡도가 낮아짐. (권장되는 방법1)
     */
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    /**
     * private static final Settings INSTANCE = new Settings();
     * 생성 비용이 낮다면 eager initialization으로 instance에 생성해서 처음에 주입하는 방식도 사용할 수 있음. (Thread-safe)
     * 미리 만든다는 것 자체가 단점이 될 수 있음. 인스턴스 생성 과정이 길고 메모리를 많이 사용하고 애플리케이션에서 많이 쓰지 않으면
     * 손해가 발생할 수 있음.
     */

    /**
     * 가장 쉽게 thread-safe한 싱글톤 구현하기
     * 단점은 getInstance를 호출할 때마다 동기화 blocking 처리 때문에 성능이 하락할 수 있음.
     */
    /*public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }*/

    /**
     * double checked locking
     * 대신 instance 앞에 키워드에 volatile이라고 써줘야함. (Java 1.5 이후)
     */
    /*public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }

        return instance;
    }*/


}
