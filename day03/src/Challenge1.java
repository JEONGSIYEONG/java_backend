// 메소드 챌린지

// 1) 몇단? 입력받고 구구단 출력해주는 메소드 작성하고 maind에서 부르기
// 2)

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        gugudan(num);
    }

    public static void gugudan(int a) {
        for(int i=1; i<=9; i++) {
            int result = a * i;
            System.out.println(a + "*" + i + "=" + result);
        }
    }
}
