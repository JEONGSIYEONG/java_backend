public class ArrayIterateExampleMain {
    public static void main(String[] args) {
        // 배열 + 반복문
        // 변수 5개 만들고, 반복문으로 출력해보기
//        int a=1;
//        int b=2;
//        int c=3;
//        int d=4;
//        int e=5;
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

        for(int i=0; i<5; i=i+1) {
            System.out.println(nums[i]);
        }

//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
//        System.out.println(nums[4]);

    }
}

// 변수, 조건문, 반복문, 배열
// 챌린지(n개)
// 목적: 문법에 익숙해지고, 생각을 잘 정리하는법(코드 -> 생각, 생각-> 코드)