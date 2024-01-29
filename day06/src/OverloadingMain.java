// 오버로딩 : 메소드를 과하게, 더많이 쌓아두는 개념
// => 동일한 이름의 메소드를 만들수 있게 해줌

// 반환형이랑은 상관x
// 메소드이름 동일하게 만들수있는 조건
// 1) 파라미터의 갯수가 다르거나
// 2) 파라미터의 타입이 다르거나

public class OverloadingMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10.2, 20.5);
        calc.add(10.2, 20.5, 30.1);
    }
}
