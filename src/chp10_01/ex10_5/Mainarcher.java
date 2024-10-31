package chp10_01.ex10_5;

public class Mainarcher {
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher();
        archer1.shoot(); //archer 의 shoot
        ma.shoot(); // masterarcher 의 shoot
        archer2.shoot(); // masterarcher 의 shoot
        archer3.shoot(); // masterarcher의 shoot
    }

}
