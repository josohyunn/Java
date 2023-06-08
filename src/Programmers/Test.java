package Programmers;

public class Test {

    public static int solution(int num1, int num2) {
        if ((num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <= 100)) {
            // int answer = (int) (num1 % num2);
            System.out.println();
            return 0;
            // return answer;
        } else
            return -1;
    }

    public static void main(String[] args) {
        solution(3, 2);
    }

}
