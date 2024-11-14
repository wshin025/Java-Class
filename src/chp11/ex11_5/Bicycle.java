package chp11.ex11_5;

public class Bicycle implements Vehicle {

    @Override
    public void horn(){
        System.out.println("따르릉 따르릉");
    }

    // 인터페이스에 정의된 static 메소드 stop()은 오버라이딩 할 수 없다.
    static public void stop(String place){
        System.out.println(place +"에 자전거가 멈춘다.");
    }
}
