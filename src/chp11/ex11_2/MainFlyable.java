package chp11.ex11_2;

import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bird =new Bird();
        Helicopter hc =new Helicopter();
        Rocket rc =new Rocket();

        //배열의 각 객페의 참조 값을 저장한다.
        Flyable[] flyables={bird,hc,rc};

        for(Flyable flyable:flyables){
            flyable.fly();
        }
        System.out.println("******************************");
        ArrayList<Flyable> flyableList=new ArrayList<>();
        flyableList.add(bird);
        flyableList.add(hc);
        flyableList.add(rc);

        for(Flyable flyable:flyableList){
            flyable.fly();
        }
    }
}
