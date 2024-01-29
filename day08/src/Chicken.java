public class Chicken extends Bird implements LandAnimalBehavior{
    public void fly() {
        System.out.println("닭이 날아요~~");
    }

    @Override
    public void breath() {
        System.out.println("닭이 호흡한다");
    }

    @Override
    public void walk() {
        System.out.println("닭이 걸어요");
    }

    @Override
    public void speak() {
        System.out.println("꼬꼬댁");
    }


}
