package ch08.ex4;

public class Avenger {
    private String name;
    private int Healthpower;

    public Avenger(String name, int Healthpower) {
        this.name = name;
        this.Healthpower = Healthpower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpower() {
        return Healthpower;
    }

    public void setHealthpower(int healthpower) {
        Healthpower = healthpower;
    }

    public void punch(Avenger enemy) {
        System.out.printf("<%s>의 펀치가 날아갔다.",name);
        enemy.setHealthpower(this.getHealthpower()-10);
        System.out.printf(" => <%s>의 체력이 %d로 감소했다.\n",enemy.getName(),enemy.Healthpower);
    }

}
