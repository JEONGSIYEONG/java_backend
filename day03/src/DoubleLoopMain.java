// 중첩반복문
// 반복문안의 반복문안의 반복문안의 반복문......
// 반복을 반복하는 반복문....

// 최대 3개까지 => 1~2개 중첩반복문
// 중첩반복문(아파트)
// i: 동, j: 층
// A B C D E
// 10 10 10 10 10
public class DoubleLoopMain {
    public static void main(String[] args) {
        // i:0, j:0~9
        // i:1, j:0~9
        // i:2, j:0~9
        // i:3, j:0~9
        // i:4, j:0~9
        //.
        // i:9, j:0~9

        // 10*10 = 100
        for(int i=0; i<10; i++) {

            for(int j=0; j<10; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
