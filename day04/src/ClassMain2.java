// ClassMain2 (main 넣고)
// 몬스터 2마리 만들어보기
// 키보드에서 입력받아서 정보 넣기
// 몬스터 두마리 정보 출력하기

import java.util.Scanner;

public class ClassMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Monster m1 = new Monster();
        Monster m2 = new Monster();

        System.out.println("몬스터 1의 능력치를 입력하세요.");
        System.out.println("hp : ");
        m1.hp = sc.nextInt();
        System.out.println("mp : ");
        m1.mp = sc.nextInt();
        System.out.println("타입 : ");
        m1.type = sc.nextLine();

        System.out.println("몬스터 2의 능력치를 입력하세요.");
        System.out.println("hp : ");
        m2.hp = sc.nextInt();
        System.out.println("mp : ");
        m2.mp = sc.nextInt();
        System.out.println("타입 : ");
        m2.type = sc.nextLine();

        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
