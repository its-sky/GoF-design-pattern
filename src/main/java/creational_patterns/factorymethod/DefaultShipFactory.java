package creational_patterns.factorymethod;

public abstract class DefaultShipFactory implements ShipFactory {

    /**
     * Java 9 버전부터는 인터페이스에 default, private 메소드를 구현할 수 있기 때문에
     * 실질적으로 추상 클래스의 사용도가 줄어들긴 했다.
     */
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
