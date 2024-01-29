// 배열 (Array)

public class ArrayMain {
    public static void main(String[] args) {
        // int형 변수 5개 : 배열로
        // 자료형 변수명; (기본 변수공간만 만들기)
        // 자료형[] 변수명 = new 자료형[방의개수]; (배열 공간만 만들기)

        int[] arr1 = new int[5];
        // 방번호 : 0,1,2,3,4 (5칸)
        arr1[0] = 10;   // a = 10;
        arr1[1] = 20;   // b = 20;
        arr1[2] = 30;   // c = 40;
        arr1[3] = 40;   // d = 50;
        arr1[4] = 100;  // e = 100;

        System.out.println("첫번째 값 : " + arr1[0]);
        System.out.println("두번째 값 : " + arr1[1]);
        System.out.println("세번째 값 : " + arr1[2]);
        System.out.println("네번째 값 : " + arr1[3]);
        System.out.println("다섯번째 값 : " + arr1[4]);
    }
}
