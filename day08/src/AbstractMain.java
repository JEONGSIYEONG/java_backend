// 추상클래스(Abstract)
// 자바의 콜백

public class AbstractMain {
    public static void main(String[] args) {
        Chamsae chamsae = new Chamsae();
        chamsae.jump();

        // 익명(anonymous)
        new Bird() {
            @Override
            public void fly() {
                System.out.println("비둘기가 날아요~");
            }

            @Override
            public void walk() {
                System.out.println("비둘기가 걸어요~");
            }
        }.fly();

        Tiger t  = new Tiger();
        t.breath();
//        pigeon.fly();
//        pigeon.walk();


//        Bird[] birds = new Bird[3];
//        birds[0] = new Chamsae();
//        birds[1] = new Chicken();
//        birds[2] = new Chamsae();
//
//        for(int i=0; i<birds.length; i++) {
//            birds[i].fly();
//            birds[i].speak();
//            birds[i].walk();
//        }
    }
}
