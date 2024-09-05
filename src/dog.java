public class dog {
    private String name;

    private int age;

    private String breeds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public void wag(){
        System.out.println(name+"(이)가 살랑살랑");
    }
    public void bark(){
        System.out.println(name+"(이)가 멍멍");
    }

    public void  bark(int times, String Sound){
        System.out.println("왈!왈!와! Sans!");
        System.out.printf("%s 가(이) %d번 %s 짖는다.\n",name,times,Sound);
    }

}
