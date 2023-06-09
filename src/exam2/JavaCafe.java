package exam2;

public class JavaCafe {
    public static void main(String[] args) {
        // printPay(10.00, 40);
        // printPay(10.00, 50);
        // printPay(7.50, 38);
        // printPay(8.50, 66);
        printPay(10, 41);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        // 1. 예외처리
        if (basePay < 8) { // else if로 안하는 이유 : 모듈화가 안된다 + 가독성 떨어짐
            System.out.println("최저 시급 에러!");
            return; // void일 때 메서드 종료(값을 반환하지 않고 종료)
        }
        if (hours > 60) {
            System.out.println("초과근무 시간 에러");
            return;
        }

        // 2. 월급 계산
        double pay = basePay * hours; // 10, 41

        // 3. 추가 수당 계산
        if (hours > 40) {
            pay = pay + (hours - 40) * (basePay * 0.5);
        }

        System.out.printf("$ %.2f\n", pay);

    }
}
