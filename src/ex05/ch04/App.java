package ex05.ch04; //ch04 : super

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // hp와 attack에 접근 -> 변경
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp: " + u2.hp);
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 100);
        ProtossUnit d1 = new Zealot("드라군1", 100, 100);

        attack(z1, d1);
    }

}
