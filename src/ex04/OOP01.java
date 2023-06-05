package ex04;

class Player {
    String name;
    int thirsty; // 0~100 (클 수록 목말라짐)

    public Player(String name, int thirsty) {
        this.name = name;
        this.thirsty = thirsty;
    }

    public void drink() {
        thirsty = thirsty - 30;
    }
}

public class OOP01 {
    public static void main(String[] args) {
        Player p1 = new Player("홍길동", 100);
        Player p2 = new Player("임꺽정", 100);

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.drink();

        System.out.println(p1.thirsty);
        System.out.println(p2.thirsty);
    }
}