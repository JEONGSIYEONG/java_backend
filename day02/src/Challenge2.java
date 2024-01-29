import java.util.Scanner;

// 1. kor(국어점수) 5개 저장하는 배열
// 국어점수를 키보드로부터 반복적으로 입력받아 저장
// 평균출력


// 2 (배열3개)
// 1) 국어점수, 수학점수, 영어점수 각각 3개씩 저장하는 배열
// 2) 국어점수, 수학점수, 영어엄수를 키보드로부터 반복적으로 입력받아 저장하기
// 3) 국어평균, 수학평균, 영어평균, 전체평균 출력하기
public class Challenge2 {
    public static void main(String[] args) {
//        int[] scr = new int[5];
//
        Scanner sc = new Scanner(System.in);
//
//        for(int i=0; i<5; i=i+1) {
//            scr[i] = sc.nextInt();
//        }
//        double avg = (scr[0] + scr[1] + scr[2] + scr[3] + scr[4]) / 5.0;
//
//        System.out.println("평균 : " + avg);

        int[] kor = new int[3];
        int[] math = new int[3];
        int[] eng = new int[3];

        int korTotal = 0;
        int mathTotal = 0;
        int engTotal = 0;

        for(int i=0; i<3; i=i+1) {
            System.out.println("학생" + (i+1) + "의 점수를 입력하세요.");

            kor[i] = sc.nextInt();
            korTotal += kor[i];

            math[i] = sc.nextInt();
            mathTotal += math[i];

            eng[i] = sc.nextInt();
            engTotal += eng[i];
        }

        double korAvg = korTotal / 3.0;
        double mathAvg = mathTotal / 3.0;
        double engAvg = engTotal / 3.0;
        double totalAvg = (korAvg + mathAvg + engAvg) / 3.0;

        System.out.println("국어 평균 : " +  korAvg);
        System.out.println("수학 평균 : " +  mathAvg);
        System.out.println("영어 평균 : " +  engAvg);
        System.out.println("전체 평균 : " +  totalAvg);

    }
}
