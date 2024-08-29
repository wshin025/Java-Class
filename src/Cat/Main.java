package Cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.setName("AICat");
        cat.setBreeds("Persian");
        cat.setWeight(3);

        System.out.printf("고양이 이름 : %s\n", cat.getName());
        System.out.printf("고양이 종류 : %s\n", cat.getBreeds());
        System.out.printf("고양이 몸무게 : %.2fkg\n", cat.getWeight());

        System.out.print(cat.getName() +"이 ");
        cat.clow();

        System.out.print(cat.getName() +"이 ");
        cat.meow();

    }

}