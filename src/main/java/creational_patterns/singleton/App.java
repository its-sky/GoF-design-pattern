package creational_patterns.singleton;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();
        System.out.println(settings == settings1);

        /**
         * java reflection을 통해 singleton 보장을 깨뜨릴 수 있음.
         * 굳이 막자면 Settings를 enumeration을 사용하면 됨. 리플렉션에 안전함.
         * 단점은 클래스를 로드하는 순간 이미 만들어지는게 단점이라면 단점임.
         */
        /*Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings2 = constructor.newInstance();*/

        /**
         * 직렬화/역질렬화를 통해 singleton을 깨뜨릴 수 있음.
         * Serializable 구체 클래스에 protected Object readResolve() 시그니처 메소드가 있으면 역직렬화를 할 때 무조건 거치게 되어 있어서
         * 해당 방법을 막을 수 있음.
         */
        /*try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            Settings settings2 = (Settings) in.readObject();
        }*/

    }

}
