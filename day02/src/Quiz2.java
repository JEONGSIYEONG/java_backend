import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
        int d[] = new int[10];

        int aTotal = 0;
        int bTotal = 0;
        int cTotal = 0;
        int dTotal = 0;


        for(int i=0; i<10; i++) {
            System.out.println("a동" + (i+1) + "층의 거주민 수를 입력하세요.");
            a[i] = sc.nextInt();
            aTotal += a[i];
         }

        for(int i=0; i<10; i++) {
            System.out.println("b동" + (i+1) + "층의 거주민 수를 입력하세요.");
            b[i] = sc.nextInt();
            bTotal += b[i];
        }

        for(int i=0; i<10; i++) {
            System.out.println("c동" + (i+1) + "층의 거주민 수를 입력하세요.");
            c[i] = sc.nextInt();
            cTotal += c[i];
        }

        for(int i=0; i<10; i++) {
            System.out.println("d동" + (i+1) + "층의 거주민 수를 입력하세요.");
            d[i] = sc.nextInt();
            dTotal = d[i];
        }

        int total = aTotal + bTotal + cTotal + dTotal;

        System.out.println("=======================================================================");
        System.out.println("a동의 거주민 수는 " + aTotal + " 명 입니다.");
        System.out.println("b동의 거주민 수는 " + bTotal + " 명 입니다.");
        System.out.println("c동의 거주민 수는 " + cTotal + " 명 입니다.");
        System.out.println("d동의 거주민 수는 " + dTotal + " 명 입니다.");
        System.out.println("=======================================================================");

        for(int i=0; i<10; i++) {
            System.out.println("a동 " + (i+1) + " 층의 거주민 수는 " + a[i] + " 명 입니다.");
        }
        System.out.println();
        for(int i=0; i<10; i++) {
            System.out.println("b동 " + (i+1) + " 층의 거주민 수는 " + b[i] + " 명 입니다.");
        }
        System.out.println();
        for(int i=0; i<10; i++) {
            System.out.println("c동 " + (i+1) + " 층의 거주민 수는 " + c[i] + " 명 입니다.");
        }
        System.out.println();
        for(int i=0; i<10; i++) {
            System.out.println("d동 " + (i+1) + " 층의 거주민 수는 " + d[i] + " 명 입니다.");
        }
        System.out.println("=======================================================================");
        System.out.println("아파트 총 거주인원 수는 " + total + " 명 입니다.");

    }
}
