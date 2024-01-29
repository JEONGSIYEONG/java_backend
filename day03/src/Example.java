// 구구단
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6

// -------------------------------
// 반복문
// 1) 2단만 출력하기 (반복문)
// 2) 2~9단 한꺼번에 출력하기 (중첩반복문)

// 곱해지는 숫자가 증가하고, 곱셈값이 변화
// 곱해지는 숫자에다가 2를 곱해서 출력

public class Example {
    public static void main(String[] args) {
        // 2단만 출력
        for(int i=0; i<9; i++) {
            System.out.println(2 + "*" + (i+1) + "=" + 2*(i+1));
        }

        // 2~9단 출력
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++) {
//                System.out.println((i+1) + "*" + );
            }
        }
    }
}
