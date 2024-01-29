import java.util.Scanner;

public class ArrayProblemMain {
    public static void main(String[] args) {
        // 소수점 배열 3칸 생성
        // 키보드로 소수점 3개 입력 -> 배열 저장
        // 평균구해서 100미만이면 "실패" 100 이상이면 "성공"
        double arr1[] = new double[3];
        Scanner sc = new Scanner(System.in);
        double avg;

        arr1[0] = sc.nextDouble();
        arr1[1] = sc.nextDouble();
        arr1[2] = sc.nextDouble();

        avg = (arr1[0] + arr1[1] + arr1[2]) / 3.0;

        if(avg < 100) {
            System.out.println("실패");
        } else {
            System.out.println("성공");
        }
    }
}
