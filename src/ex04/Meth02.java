package ex04;

//자바는 모든것이 클래스 안에 있어야한다.(변수, 메서드 등)
class Cal02 {
    void add(int n1, int n2) {
        System.out.println("더하기 : " + (n1 + n2));
    } // 스택을 종료하고, 복귀주소를 확인하고 복귀한다.

    void minus(int n1, int n2) {
        System.out.println("빼기 : " + (n1 - n2));
    }

    void multi(int n1, int n2) {
        System.out.println("곱하기 : " + (n1 * n2));
    }

    void divide(int n1, int n2) {
        System.out.println("나누기 : " + (n1 / n2));
    }
}

// 133~144 읽어보기
public class Meth02 { // argument : 인수, parameter : 매개변수
    // 매개변수는 함수의 stack에 저장됨. 메서드 종료시 날라감
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        c1.add(10, 5);
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);

    }

}
