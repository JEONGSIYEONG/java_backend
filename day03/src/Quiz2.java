import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int starCnt = sc.nextInt();
        printStar(starCnt);
    }
    public static void printStar(int cnt) {
        for (int i=1; i<=cnt; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
