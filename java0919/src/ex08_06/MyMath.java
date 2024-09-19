package ex08_06;

public class MyMath {
// 공유영역에 할댕 되는 메소트 : 클래스 메소드
    static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
    static int min(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }
}
