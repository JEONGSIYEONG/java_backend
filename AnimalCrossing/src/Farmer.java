public class Farmer {
    int appleCnt = 0;
    int money = 0;
    AppleTree aT = new AppleTree();

    public int shakeTree() {
        if(aT.appleCnt > 0) {
            ++appleCnt;
            System.out.println("사과 1개 획득!");
        }
        aT.shake();
        return appleCnt;
    }

    public void saleApple(Merchant mc) {
        money += 100;
        appleCnt -= 1;
        mc.appleCnt += 1;
    }

    public void buyApple(Merchant mc) {
        money -= 100;
        appleCnt += 1;
        mc.appleCnt -= 1;
    }


}
