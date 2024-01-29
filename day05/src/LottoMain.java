import java.util.Random;

// 로또번호 뽑고 출력하기 알고리즘
// LottoMain 제작
// 1~45까지 숫자 7개 뽑아서, 배열에 넣 고
// 배열값 전부 출력
// 중복을 허용하지않는 로또 추출기
public class LottoMain {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNums = new int[7];

//        for(int i=0; i<7; i++) {
        // 숫자뽑기 알고리즘
        for(int i=0; i<lottoNums.length; i++) {
//            int lottoNumber = random.nextInt(45) + 1;
            lottoNums[i] = random.nextInt(45) + 1;
            for(int j=0; j<i; j++) {
                if(lottoNums[j] == lottoNums[i]) {
                    i--;
                    break;
                }
            }
        }

        // 정령 알고리즘(오름차순)
        // 버블, 퀵, 힙, 머지, ........
        // 작은수 -> 큰수
        for(int i=0; i<lottoNums.length; i++) {
            // 배열값 비교해서 작은수를 앞으로 보내기
            for(int j=0; j<i; j++) {
                if(lottoNums[i] < lottoNums[j]) {
                    // 현재 가지고 있는 값이 이전 값보다 작다.
                    // swap 알고리즘
                    int temp = lottoNums[i];
                    lottoNums[i] = lottoNums[j];
                    lottoNums[i] = temp;

                }
            }
        }


        for(int i=0; i<lottoNums.length; i++) {
            System.out.println(lottoNums[i]);
        }

    }
}
