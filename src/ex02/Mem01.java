package ex02;

class Hello {
    static int price = 1000;
    String name = "커피";

    void run() {
        int n = 100;
        System.out.println("달린다");
    }
}

public class Mem01 {

    static int price = 10000;

    public static void main(String[] args) {
        System.out.println(Mem01.price);
        System.out.println(Hello.price);
        Hello c = new Hello();
        System.out.println(Hello.price); // 다른 클래스에 있는 static 변수를 호출할 때에는 [클래스.변수명] 으로 호출한다.([객체.변수명] 아님)
        System.out.println(c.name);

        c.run();

    }
}