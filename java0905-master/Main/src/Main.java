public class Main {
    public static void main(String[] args) {
        dog d1 = new dog();
        dog d2 = new dog();

        d1.setName("멍");
        d1.setBreeds("닥스훈트");
        d1.setAge(3);

        d2.setName("뭉이");
        d2.setBreeds("푸들");
        d2.setAge(5);

        System.out.printf("d1 => (name: %s, breeds: %s, age: %d)\n",d1.getName(),d1.getBreeds(),d1.getAge());
        System.out.printf("d2 => (name: %s, breeds: %s, age: %d)\n",d2.getName(),d2.getBreeds(),d2.getAge());
        d1.wag();
        d1.bark(2,"멈머");
        d2.bark(4,"왈왈");

    }
}