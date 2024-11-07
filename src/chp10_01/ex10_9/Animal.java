package chp10_01.ex10_9;

//추상클래스
//자식클래스를 표준화(특정기능을 반드시 갖도록 하기위함.)시키기 위해서 사용한다.
abstract public class Animal {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

// 추상 메소드
    public abstract void eat(String food);

    public abstract void cry(String sound);

    public void sleep (int hours){
        System.out.println(hours+"시간 동안 자다.");
    }


}
