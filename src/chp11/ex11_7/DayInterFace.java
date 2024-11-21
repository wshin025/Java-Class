package chp11.ex11_7;

public interface DayInterFace {
    // 인터페이스에서는 상수만 사용되기 때문에 public static final을 생략할 수 있다.
    // final은 처음에 초기화를 한 후에는 다른값으로 변경할 수 없다.
    //static은 인터페이스 명을 . 앞에 붙여서 상수를 사용할 수 있다.
    String MONDAY = "월요일";
    public static final String TUEDAY="화요일";

}
