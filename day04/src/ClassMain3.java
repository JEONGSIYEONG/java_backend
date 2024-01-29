// 몇명? 입력받고 사람 생성해서 20살 이상인 사람만 출력하기

import java.util.Scanner;

public class ClassMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 명?");
        int cnt = sc.nextInt();

        Human[] humans = new Human[cnt];    // 배열이라는 방을 만들어주는 행위

        for(int i=0; i<cnt; i++) {
            humans[i] = new Human();    // 객체를 생성해야함
            humans[i].name = sc.next();
            humans[i].age = sc.nextInt();
            humans[i].height = sc.nextDouble();
            humans[i].gender = sc.next();
         }

        for(int i=0; i<cnt; i++) {
            if(humans[i].age >= 20) {
                System.out.println(humans[i].toString());
            }
        }




    }
}
