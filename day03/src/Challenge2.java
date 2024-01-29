// 몇단부터 몇단까지? 두 가지 입력받고 구구단 출력해주는 메소드 작성하고 main 에서 출력
// 변수 두개 (몇단부터, 몇단까지)
// 메소드에 변수 두개 전달 (반환 똥 x)
// 메인에서 부르기

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startDan = sc.nextInt();
        int endDan = sc.nextInt();

        gugudan(startDan, endDan);
    }

    public static void gugudan(int sd, int ed) {
        for(int i=sd; i<=ed; i++) {
            for(int j=1; j<=9; j++) {
                int result = i * j;
                System.out.println(i + "*" + j + "=" + result);
            }
        }
    }
}
