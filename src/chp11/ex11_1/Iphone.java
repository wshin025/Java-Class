package chp11.ex11_1;

public class Iphone implements Phone, Alram, Message {
    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle + "음악을 재생한다.");
    }

    @Override
    public void beep() {
        System.out.println("beep음이 삐삐삐삐 발생한다.");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content + "메세지를 전송한다.");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content + "메세지를 받는다.");
    }

    @Override
    public void callphone(String phoneNumber) {
        System.out.println(phoneNumber + "로 전화를 건다");
    }

    @Override
    public void recivePhone(String phoneNumber) {
        System.out.println(phoneNumber + "로 전화를 받는다");
    }
//    인터페이스에 있는것을 여기서 구현화 해야한다.

    public void sendAirdrop(String content) {
        System.out.println("에어드롭으로" + content + "를(을) 보낸다.");
    }

}
