package ch08.ex02;

public class Drink {
        String name;
        int price;

    public Drink() {
        System.out.println("default constructor 호출");
    }

    Drink(String name, int price) {
    this.name = name;
    this.price = price;

        System.out.println("(String name, int price) constructor 호출");
    }
    public String toString(){
        return String.format("name: %s, price: %d", name, price);
    }

}
