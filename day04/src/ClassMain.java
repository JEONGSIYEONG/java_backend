public class ClassMain {
    public static void main(String[] args) {
        // 객체만드는법
        // 클래스이름 객체명 = new 생성자;

        // Human 클래스를 실체화 했다.
        // Human 클래스를 객체화 했다.
        // Human 클래스를 인스턴스화 했다.
        Human h1 = new Human();
        h1.age = 20;
        h1.gender = "남자";
        h1.height = 190.2;
        h1.name = "참새";

        h1.walk();
        h1.run();
//        h1.status();

        System.out.println(h1.toString());
    }
}

// Human 클래스에 사람의 정보를 전부 출력해주는 메소드를 만들어봐라.
