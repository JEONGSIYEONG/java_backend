public class Bank {
    private int money;

    public void setMoney(int _money, Human human) {
        if(human.name.equals("은행장")) {
            money = _money;
        } else {
            System.out.println("예끼 이놈!!");
        }

    }

    public int getMoney() {
        return money;
    }
}
