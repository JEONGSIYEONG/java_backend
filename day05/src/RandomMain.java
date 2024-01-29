// 랜덤한 숫자를 뽑기위해 Random 클래스를 사용

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(10);
        int randomValue = random.nextInt(100);
        System.out.println(randomValue);

        // 로또 1~45
        // 1~45 숫자를 뽑아보는 코드 작성해주기
//        random.nextInt(45); // 0~45
        int lottoNumber = random.nextInt(45) + 1;
        System.out.println(lottoNumber);

        // 알고리즘
        // 로또번호 뽑고 출력하기 알고리즘
        // LottoMain 제작
        // 1~45까지 숫자 7개 뽑아서, 배열에 넣 고
        // 배열값 전부 출력
    }

}
