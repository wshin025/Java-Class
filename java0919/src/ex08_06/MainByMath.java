package ex08_06;

import java.util.Scanner;

public class MainByMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 정수값 : ");
        int n1 = scanner.nextInt();
        System.out.println("두번째 정수값 : ");
        int n2 = scanner.nextInt();

        System.out.printf("%d과 %d 중에 더 큰갑 : %d\n",n1, n2, MyMath.max(10,20));
        System.out.printf("%d과 %d 중에 더 작은갑 : %d\n",n1, n2, MyMath.min(10,20));
        scanner.close();
    }
}
