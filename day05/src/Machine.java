import java.util.Random;

public class Machine {
    String name;

    public Machine(String _name) {
        name = _name;
    }

    public void dobak1(Human h1, Human h2) {
        // 둘중에 한명
        // h1, h2
        // 홀, 짝
        Random random = new Random();

        // 1~11
        // 1 3 5 7 9 11
        // 2 4 6 8 10 12
        int number = random.nextInt(12) + 1; // 0~11 + 1
        if(number % 2 == 0) { // 짝수
            System.out.println("짝수에 행운이...");
            h2.money += 10000;
        } else { // 홀수
            System.out.println("홀수에 행운이...");
            h1.money += 10000;
        }
    }
}
