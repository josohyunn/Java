package ex03;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class MyStar01 {
    public static void main(String[] args) {

        for (int k = 1; k < 6; k++) {
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==============");

        for (int k = 6; k > 1; k--) {
            for (int i = k; i > 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

        String[] star = { "", "", "", "", "" };
        System.out.println("========트리========");
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("줄수를 입력하세요 : ");
        num = sc.nextInt();

        for (int i = 0; i < (num / 2 + 1); i++) {
            for (int j = 0; j < (num / 2 + 1) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (num / 2); i > 0; i--) {
            for (int j = (num / 2 + 2) - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i * 2 + (num / 2) - 2; k > (num / 2) - 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * for (int i = 0; i < 3; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * for (int i = 0; i < 5; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * for (int i = 0; i < 3; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * for (int i = 0; i < 1; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         */

        /*
         * for (int k = 1; k < 10; k++) {
         * for (int i = 0; i < k; i++) {
         * if ((k % 2) == 1)
         * System.out.print("*");
         * else
         * k = k;
         * }
         * if (k == 5) {
         * break;
         * }
         * System.out.println();
         * }
         */

    }

}
