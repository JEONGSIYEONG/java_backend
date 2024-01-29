import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        int i = 0;
        int result;
        int total = 0;

        int[] price = new int[3];
        price[0] = 5000;
        price[1] = 8000;
        price[2] = 1000;
        Scanner sc = new Scanner(System.in);

        while(i==0) {
            System.out.println("[1] 햄버거, [2] 치킨, [3] 콜라, [0] 프로그램 종료");
            result = sc.nextInt();

            if(result == 1) {
                System.out.println("햄버거를 선택하셨습니다.");
                total += price[0];
            }
            else if(result == 2) {
                System.out.println("치킨을 선택하셨습니다.");
                total += price[1];
            }
            else if(result == 3) {
                System.out.println("콜라를 선택하셨습니다.");
                total += price[2];
            }
            else if(result == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.out.println("총 금액 : " + total);
                break;
            }
            else {
                System.out.println("잘못된 접근입니다.");
            }
        }
    }
}
