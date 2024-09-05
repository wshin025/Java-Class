package square;

public class MainSquare {
    public static void main(String[] args) {
    square square = new square();

    square.setLength(5);
    int Sl = square.getLength();
    int result = square.area();

    square s1 = new square();
    s1.setLength(9);
    int result2 = s1.area();

    System.out.printf("한변의 길이가 %d인 정사각형의 넓이는 %d입니다.\n",Sl,result);
    System.out.printf("한변의 길이가 %d인 정사각형의 넓이는 %d입니다.\n",s1.getLength(),result2);
    }
}
