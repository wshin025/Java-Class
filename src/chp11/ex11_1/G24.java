package chp11.ex11_1;

public class G24 {

    public interface Phone {
        // 인터페이스는 상수, 추상메소드, default, static 메소드 등을 사용할 수 있습니다.
        // 상수는 final 과, static 을 생략 가능

        String PRODUCT_NAME="Apple";
        //final String PRODUCT_NAME = "Apple";


        public abstract void callphone(String phone) ;


// 추상메소드는 public abstract를 생략가능

        void recivePhone(String phoneNumber) ;


    }
}
