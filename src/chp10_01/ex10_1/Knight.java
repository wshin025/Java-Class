package chp10_01.ex10_1;

public class Knight extends Novice {
    int stamina;

    void slash(){
        System.out.printf("%s(HP: %d) 의 칼로베기 ~~////////////~~ \n" , name,hp,stamina );
    }
}
