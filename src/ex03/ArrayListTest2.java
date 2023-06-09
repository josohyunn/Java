package ex03;

import java.util.ArrayList;

class Person {
    String name;
    int tel;

    public Person(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }
}

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("홍길동", 5678));
        list.add(new Person("김유신", 5679));
        list.add(new Person("최자영", 5680));
        list.add(new Person("김영희", 5681));

        for (Person obj : list)
            System.out.println("(" + obj.name + ", " + obj.tel + ")");

    }

}
