package exam2;

public class Elevator {
    public static void main(String[] args) {
        // 변수 생성
        int a = 13;
        int b = 7;
        int c = 252;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

    public static String guide(int floor) { // 1.인수 2.리턴 3.
        // 1. 유효성 검사 (필터)
        if (floor > 20 || floor < 1) // 이게 밑에 else하는것보다 좋다(잘못된 값은 핵심 로직을 처리할 필요가 없으니까)
            return "오류";

        // 2. 리턴값 초기화
        String result = ""; // 초기화해주고

        // 3. 알고리즘
        if (floor >= 1 && floor <= 10) {
            result = "저층"; //
        } else if (floor > 11 && floor <= 20) {
            result = "고층";
        }

        // 4. 리턴하기
        return result; // 마지막에 return

    }
}
