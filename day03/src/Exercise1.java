import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int starCnt = 1;

        System.out.println("숫자를 입력하세요 : ");
        int starNum = sc.nextInt();
        int blankCnt = (starNum + 1)/2;

        for(int i=1; i<=starNum; i++) {
            for(int j=1; j<=blankCnt; j++) {
                System.out.print(" ");
            }
            blankCnt--;
            for(int k=1; k<=starCnt; k++) {
                System.out.print("*");
            }
            starCnt++;
            System.out.println();
        }
    }
}
