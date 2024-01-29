// 정보: 변수
// 행위: 메소드

// 메인메소드가 포함된 파일이 아니라면, static 안 붙이고 메소드 만들수있음

public class Human {
    int age;    // 예시값: 20
    String name;    // 예시값: 참새
    double height;  // 예시값: 190.2
    String gender;  // 예시값: 남자

    // 걷다
    public void walk() {
        System.out.println("사람이 걷는다.");
    }

    // 뛴다
    public void run() {
        System.out.println("사람이 뛴다.");
    }

    public void status() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name) ;
        System.out.println("키 : " + height);
        System.out.println("성별 : " + gender);
    }
    // 빈칸 generate 후 모두 선택
    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }
}
