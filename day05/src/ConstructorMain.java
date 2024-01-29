public class ConstructorMain {
    public static void main(String[] args) {
        // 클래스이름 객체명 = new 클래스이름();
        // 클래스이름 객체명 = new 생성자
        Student s1 = new Student();
        s1.age = 10;
        s1.height = 180.9;
        s1.name = "참새";

        Student s2 = new Student(15, "비둘기", 180.9);
        System.out.println(s2.toString());
    }
}
