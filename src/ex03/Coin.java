package ex03;

import java.util.Scanner;

//아래 코드를 배열과 for문을 이용하여 리팩토링하시오.
public class Coin {
    public static void main(String[] args) {
        // 500, 50, 10(개수를 최소로 해서 주세요.)
        // final : 상수라고 제약거는것. 다른 개발자가 봤을 때 안바뀔거라는 것
        System.out.print("금액을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        final int money = sc.nextInt(); // scanner로 수정
        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담은 변수

        int tempMoney[] = { 500, 100, 50, 10 }; // 코드를 모듈화 시킬거기 때문에 int tempMoney=500;으로 시작 안하는것
        int[] myArray = new int[10]; // 배열 크기만 선언

        /*
         * tempMoney = 500;
         * count = restMoney / tempMoney; //
         * System.out.println(tempMoney + "원 : " + count);
         * restMoney = restMoney % tempMoney;
         * 
         * tempMoney = 100;
         * count = restMoney / tempMoney; // 1
         * System.out.println(tempMoney + "원 : " + count);
         * restMoney = restMoney % tempMoney;
         * 
         * tempMoney = 50;
         * count = restMoney / tempMoney; // 1
         * System.out.println(tempMoney + "원 : " + count);
         * restMoney = restMoney % tempMoney;
         * 
         * tempMoney = 10;
         * count = restMoney / tempMoney; // 1
         * System.out.println(tempMoney + "원 : " + count);
         * restMoney = restMoney % tempMoney;
         */

        for (int n = 0; n < tempMoney.length; n++) {
            count = restMoney / tempMoney[n]; // 1
            System.out.println(tempMoney[n] + "원 : " + count);
            restMoney = restMoney % tempMoney[n];
        }

    }

}
