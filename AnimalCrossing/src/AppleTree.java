public class AppleTree {
    int appleCnt = 20;
    public int shake() {
        if(appleCnt > 0) {
            --appleCnt;
        }
        else {
            System.out.println("=============================");
            System.out.println("사과가 부족합니다!");
        }
        return appleCnt;
    }
}
