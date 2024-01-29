// 메소드(method) = 함수(function)
// 뭔가 들어왔을때 처리해서 결과내주는 장치, 문법
// 입으로 밥을먹고, 소화시켜서 똥~~~

// 코드를 개선시킬 수 있게 됨 (재사용성 증가)
// 메소드 형태 4개
// 1) 입구x, 출구x => test1
// 2) 입구o, 출구x => test2
//** 3) 입구x, 출구o => test3
// 4) 입구o, 출구o => test4
// ===>? 정수 두개를 입구에 줘서, 곱셈결과를 main에서 출력

// 입구: 매개변수, 파라미터, 인자, 인수
// 출구: 리턴타입, 반환형, 반환타입

public class MethodMain {
    public static void main(String[] args) {
//        메소드 불러!!
//        메소드이름(); (기본형태)
//        for(int i=0; i<5; i++) {
//            int result = test3();   // 반환했다, 리턴했다, 똥을줬다
//            System.out.println(result);
////        }
        int a = test4(3,5);
        test4(3,5);
        System.out.println(a);
    }

//    public 출구 메소드이름(입구) {
//
//    }
    // 입구, 출구 둘다 없음
    public static void test1() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }

    // 입구있고, 출구 없음
    public static void test2(int num1, int num2) {
        System.out.println(num1);
        System.out.println(num2);
    }
    // 입구없고, 출구 있음
    public static int test3() {
        int num = 10;
        System.out.println("숫자를 주겠습니다.");
        return num;
    }

    public static int test4(int a, int b) {
        int result = a * b;
        return result;
    }
}
