// 캐스팅 : 자료형간의 변환(객체형간의 변환)
// 일반자료형 : int, double, char, byte~~~, float
// 객체형 : String, Student, ~~~~~

// int - > double : 묵시적(암시작) 캐스팅 : implicit
// double -> int : 명시적 캐스팅 : explicit

public class CastingMain1 {
    public static void main(String[] args) {
        int num1 = 3;
        double castedNum1 = num1;
        System.out.println(castedNum1);

        double num2 = 3.14;
        int castedNum2 = (int) num2;
        System.out.println(castedNum2);

//        String -> double
        String num3 = "3.15";
// static 이 붙으면 객체를 만들지 않고도 바로 접근해서 사용 가능
        double castedNum3 = Double.parseDouble(num3);
        System.out.println(castedNum3);

//        String -> int
        String num4 = "3";
// static 이 붙으면 객체를 만들지 않고도 바로 접근해서 사용 가능
        int castedNum4 = Integer.parseInt(num4);
        System.out.println(castedNum4);
    }
}
