// 자바는 1개의 클래스만 상속가능
// 인터페이스는 여러 개 가능
// 구글에서 Button extends View implements ClickBehavior
// 구글에서 Text extends View implements ClickBehavior

// extends 상속받았다
// implements 구현했다
// 업캐스팅 개념에 대해서 공부하기

public class Chamsae extends Bird implements LandAnimalBehavior, TwoLegsAnimalBehavior {
    @Override
    public void jump() {
        System.out.println("두발달린 참새가 뛰어요");
    }

    @Override
    public void fly() {
        System.out.println("참새 날아요~~");
    }

    @Override
    public void breath() {
        System.out.println("참새가 호흡한다");
    }

    @Override
    public void walk() {
        System.out.println("참새가 걸어요");
    }

    @Override
    public void speak() {
        System.out.println("짹짹짹");
    }
}
