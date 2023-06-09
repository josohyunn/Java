package Programmers;

public class Test {

    public static int solution(int angle) {
        int answer = 0;
        if (angle <= 0 || angle > 180)
            return answer;
        else {
            if (0 < angle && angle < 90) {
                answer = 1;
                return answer;
            } else if (angle == 90) {
                answer = 2;
                return answer;
            } else if (90 < angle && angle < 180) {
                answer = 3;
                return answer;
            } else if (angle == 180) {
                answer = 4;
                return answer;
            } else {
                return answer;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(solution(70));
    }

}
