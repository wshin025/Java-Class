package ch08.ex01;

public class hero{
    private String name;
    private int power;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public hero(String name, int power, int speed){
        this.name = name;
        this.power = power;
        this.speed = speed;
    }
        public String toString(){
        return String.format("hero: %s, power: %d, speed: %d", name, power, speed);
   }


}
