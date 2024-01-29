// 오버라이딩 (overriding)

public class InheritanceMain {
    public static void main(String[] args) {
        Bidulgi bidulgi = new Bidulgi();
        Chamsae chamsae = new Chamsae();
        Chicken chicken = new Chicken();

        bidulgi.fly();
        chamsae.fly();
        chicken.fly();

        Bird bird = new Bird();
        bird.fly();
    }
}
