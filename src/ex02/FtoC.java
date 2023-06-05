package ex02;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class FtoC {
    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("===================");

        double f;
        double c;

        System.out.print("번호를 선택하시오: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i == 1) {
            System.out.print("화씨 온도를 입력하시오: ");
            f = sc.nextDouble();
            c = (double)5/9*(f-32);
            System.out.println("섭씨 온도는 " + c);
        }
        else if (i == 2) {
            System.out.println("섭씨 온도를 입력하시오: ");
            c = sc.nextDouble();
            f = (double)9/5*c+32;
            System.out.println("화씨 온도는 " + f);
            
        }
        else {
            System.out.println("1과 2중에서 골라주세요");
        }


    }

}
