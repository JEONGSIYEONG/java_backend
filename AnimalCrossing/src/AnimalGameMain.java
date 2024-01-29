// 모여봐요 동물의 숲!
// 메인클래스이름: AnimalGameMain
// 요소: 사과나무, 농부, 상인
// 농부가 사과나무를 흔들면, 농부에게 사과 1개가 지급됨
// 농부가 상인에게 사과를 팔면 100원이 농부에게 지급됩니다.
// 이 행위를 -1 입력할때까지 프로그램을 유지해주세요

import java.util.Scanner;

public class AnimalGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        Farmer fm = new Farmer();
        Merchant mc = new Merchant();

        while (true) {
            System.out.println("1. 사과나무 흔들기 2. 사과 팔기 3. 사과 구매 (-1 : 종료)");
            System.out.println("현재 보유한 사과 개수 : " + fm.appleCnt);
            System.out.println("사과나무 사과 개수 : " + fm.aT.appleCnt);
            System.out.println("보유한 금액 : " + fm.money);

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    fm.shakeTree();
                    break;
                case 2:
                    fm.saleApple(mc);
                    System.out.println("사과를 1개 팔았습니다!");
                    System.out.println("상인이 가진 사과의 개수는 " + mc.appleCnt + " 입니다.");
                    break;
                case 3:
                    fm.buyApple(mc);
                    System.out.println("사과를 1개 구매했습니다!");
                    System.out.println("상인이 가진 사과의 개수는 " + mc.appleCnt + " 입니다.");
                    break;
                case -1:
                    System.out.println("농부가 가진 사과의 개수는 " + fm.appleCnt + " 입니다.");
                    System.out.println("농부의 재산은 " + fm.money + " 입니다.");
                    System.out.println("게임을 종료합니다.");
                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }
            if(menu == -1) {
                break;
            }
        }
    }
}
