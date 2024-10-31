package chp10_01.ex10_8;

public class MainController {
    public static void main(String[] args) {
        Truck truck = new Truck("현대 포터",1.5);

        truck.move();
        truck.load();
    }
}
