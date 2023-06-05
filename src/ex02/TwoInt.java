package ex02;

import java.util.Scanner;

public class TwoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int plus, minus, mul, max, min;
        double avg;
        System.out.print("x값: ");
        x = sc.nextInt();
        System.out.print("y값: ");
        y = sc.nextInt();
        
        plus = x + y;
        minus = x - y;
        mul = x * y;
        avg = (double)(x + y) / 2;
        max = (x>y)?x:y;
        min = (x>y)?y:x;
        
        System.out.println("두 수의 합: " + plus);
        System.out.println("두 수의 차: " + minus);
        System.out.println("두 수의 곱: " + mul);
        System.out.println("두 수의 평균: " + avg);
        System.out.println("큰 수: " + max);
        System.out.println("작은 수: "+min);

      

    }

}
