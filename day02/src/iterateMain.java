// 일정 규칙이 있는 코드를 반복시키는 문법 : 반복문
// for, while


public class iterateMain {
    public static void main(String[] args) {
        // 1. 안녕하세요 for
        // i: 0~99 100번
//        for(int i=0; i<10; i=i+1) {
//            System.out.println("안녕하세요");
//        }

        // 2. 안녕하세요 while
        int i=0;
        while(i<10) {
            System.out.println("안녕하세요" + (i+1));
            i=i+1;
        }
    }
}
