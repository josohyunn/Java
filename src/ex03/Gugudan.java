package ex03;

public class Gugudan {
    public static void main(String[] args) {
        /*
         * for (int i = 2; i < 10; i = i + 1) {
         * System.out.println(i + "*1=" + (i * 1));
         * System.out.println(i + "*2=" + (i * 2));
         * System.out.println(i + "*3=" + (i * 3));
         * System.out.println(i + "*4=" + (i * 4));
         * System.out.println(i + "*5=" + (i * 5));
         * System.out.println(i + "*6=" + (i * 6));
         * System.out.println(i + "*7=" + (i * 7));
         * System.out.println(i + "*8=" + (i * 8));
         * System.out.println(i + "*9=" + (i * 9));
         * System.out.println();
         * }
         */

        for (int i = 2; i < 10; i = i + 1) {
            for (int j = 1; j < 10; j = j + 1) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }

            System.out.println();
        }

    }

}
