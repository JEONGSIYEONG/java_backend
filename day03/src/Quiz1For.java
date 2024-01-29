// 중첩반복문 이용해서 별 찍기

public class Quiz1For {
    public static void main(String[] args) {
        int starNum = 5;

        for(int i=1; i<=starNum; i++) { // 별찍기 몇번해? 5번
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
