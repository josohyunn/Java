package ex01;

public class Var03 {
    public static void main(String[] args) {
        //업 캐스팅, 묵시적 형변환
        int n1 = 10;
        double d1 = n1; // 변수 선언
        System.out.println(d1);

        //다운 캐스팅, 명시적 형변환
        double d2 = 10.5;
        int n2 = (int)d2;
        System.out.println(n2);

        //문자 형변환
        int ch = 65;
        byte by = 65;
        char data = (char)ch; //data는 2바이트, ch는 4바이트이기 때문에 형변환 해줘야한다
        char data2 = (char)by; //예외)크기는 같지만 타입 자체가 달라서 형변환 해줘야한다
        System.out.println(data);
        System.out.println(data2);

    }
}
