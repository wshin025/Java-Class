package chp11.ex11_5;

public interface Vehicle {
    void horn();
    default public void move(String from, String to) {
        System.out.printf("%s에서 %s까지 이동합니다\n", from, to);
    }
// 인터페이스에 정의된 static 메소드 stop()은 오버라이딩 할 수 없다.
// 인터페이스의 static 오버라이딩 할 수는 없지만 현재 클래스에서 정의는 할 수 있다.
// 사용할 때는 bicycle.stop() 하면된다.
    static public void stop(String place){

    }
}
