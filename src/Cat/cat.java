package Cat;

public class cat {
   private String name;
   private String breeds;
   private double weight;

    void clow (){
        System.out.println("할퀴기!!");
    }

    void meow(){
        System.out.println("야옹");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}