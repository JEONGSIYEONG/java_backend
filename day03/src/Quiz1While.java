public class Quiz1While {
    public static void main(String[] args) {
        int starNum = 5;
        int m = 1;
        int n = 1;

        while(m <= starNum) {
            n=1;
            while(n <= m) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            m++;
        }
    }
}
