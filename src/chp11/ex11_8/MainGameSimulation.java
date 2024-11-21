package chp11.ex11_8;

import chp11.ex11_2.Helicopter;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹"); //일반인
        Knight uther = new MagicKnight("우서"); //신성한 능력을 가진
        Knight gengi = new MagicKnight("겐지"); //마법능력을 가진

        atomic.slash();
        uther.slash();
        gengi.slash();

        Healer healer1= (HolyKnight)uther;
        Healer healer2= new HolyKnight("우서 동생");

        healer1.heal();
        healer1.recovery();
   //   healer1.slash();  힐러라는 인터페이스의 참조변수이므로 Healer 인터페이스를 통해 구현된 메소드만 호출 할 수있다.

        Magician magician1=(Magician)gengi;
        Magician magician2=new MagicKnight("겐지동생");

        magician1.magicShield();
        magician1.teleport();
    }
}
