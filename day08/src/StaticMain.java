// static은 static 끼리 논다~
// 공통적으로 가리켜야할 위치 또는 값이 있을 때 사용
// => 프로그램 네에서 유일한 값(객체)을 static으로 둠

public class StaticMain {
    public static void main(String[] args) {
        System.out.println("안녕");
//        StaticTest.num2 = 10;
//        System.out.println(StaticTest.num2);
//        StaticTest.go();

        StaticTest st1 = new StaticTest();          // 100번지
        st1.num = 10;   // 101번지

        System.out.println(st1.num);

        StaticTest st2 = new StaticTest();          // 200번지
        st2.num = 20;   // 201번
        System.out.println(st2.num);

        StaticTest.num2 = 20;                       // 1000번지
        System.out.println(StaticTest.num2);


//        StaticTest st = new StaticTest();
//        st.num = 10;
//        st.go();

    }
}
