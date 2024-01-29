// 캡슐화(encapsulation)
// private

// 변수에다가 private

// getMoney, setMoney
// getXXX, setXXX
// getter / setter

// 클래스
// 객체
// 상속
// 다형성
// 캡슐화

// 추상클래스
// 인터페이스
// 쓰레드

public class AccessMain2 {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        h1.name = "은행장";
        h2.name = "일반인";

        Bank b1 = new Bank();
        b1.setMoney(10000, h2);
        System.out.println(b1.getMoney());
    }
}
