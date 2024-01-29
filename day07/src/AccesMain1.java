// default, public, private, protected
// default : 같은 패키지(폴더)안에서만 접근 가능
// public : 언제 어떤 패키지에 있어도 접근 가능
// private : 같은(동일) 클래스에서만 접근가능


// protected : 상속받은 관계일 때 타 패키지에서도 접근 가능

import sample.Monster;


public class AccesMain1 {   // 접근제한자
    public static void main(String[] args) {
        // 객체.변수, 메소드
//        Student s1 = new Student();
//// private, protected
//        s1.study();

        Monster m1 = new Monster();


    }
}
