package chp11.ex11_2;

public class Rocket implements Flyable {
    @Override
    public void fly() {
        System.out.println("로켓이 대기권 밖으로 수직상승합니다.");
    }
}
