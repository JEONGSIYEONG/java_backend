public class Challenge1 {
    public static void main(String[] args) {
        // int 10칸배열
        // 1.5.7,12,55,28,90,97,53,21
        // 반복문으로 배열 출력하는데, 50이상인것만 출력하기

        int[] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 5;
        arr1[2] = 7;
        arr1[3] = 12;
        arr1[4] = 55;
        arr1[5] = 28;
        arr1[6] = 90;
        arr1[7] = 97;
        arr1[8] = 53;
        arr1[9] = 21;

        for(int i=0; i<10; i=i+1) {
//            if(arr1[i] >= 50) {
//                System.out.println(arr1[i]);
//            }
            if(arr1[i] % 2 == 1) {
                System.out.println(arr1[i]);
            }
        }

    }
}
