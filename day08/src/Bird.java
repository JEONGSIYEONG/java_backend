// 추상클래스 : abstract 연관
// 메소드를 추상화할수있음: 접근제한자 다음에 abstract붙이면 됨
// 추상메소드가 1개라도 있는 클 래스는 추상클래스가 되어야함
// 추상클래스는 추상메소드만 있는가? x
// 일반변수, 일반메소드
// 추상클래스는 단독적으로 객체화 할 수 없음
// 1) 상속받아서 업캐스팅
// 2) 익명클래스


// 메소드 오버라이딩을 강제할 수 있음
// 예시)

// Bird 클래스 상속받는건 너희들 맘인데, fly랑 walk는 반드시 오버라이딩 해라, 반드시 내용구현해라.

public abstract class Bird {

    public abstract void fly();

    public abstract void walk();

    public void speak() {
        System.out.println("새가 말해요~~");
    }
}
