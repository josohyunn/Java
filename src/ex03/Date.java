package ex03; //틈틈히 할것

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String year, month, day;
        String date;
        int y, m, d;
        String type;
        int interval;
        String temp;

        System.out.print("날짜를 입력하세요: ");
        date = sc.nextLine();
        System.out.print("변경할 날짜 중 년, 월, 일을 입력받으세요: ");
        type = sc.nextLine();
        System.out.print("더할 숫자를 입력하세요: ");
        interval = sc.nextInt();

        if (type.equals("year")) {
            year = date.substring(0, 4);
            y = Integer.parseInt(year);
            y += interval;
            temp = Integer.toString(y);
            date = date.replace(year, temp);
            System.out.println(date);
        }

        else if (type.equals("month")) {
            month = date.substring(5, 7);
            m = Integer.parseInt(month);
            m += interval;
            // temp = String.format("%02d", m);
            temp = Integer.toString(m);
            date = date.replace(month, temp);
            System.out.println(date);
        }

        else if (type.equals("day")) {
            day = date.substring(8);
            d = Integer.parseInt(day); // without debugging하면 여기 breakpoint찍힘 왜찍히지
            d += interval;
            // temp = String.format("%02d", m);
            temp = Integer.toString(d);
            date = date.replace(day, temp);
            System.out.println(date); // 값 출력은 되는데 두자리로 표현 안됨, 가끔 day랑 month가 같이 변할때가 있음
        }

        else {
            System.out.println("아님");
        }

        // date = "2023-05-26";
        // type = "day";
        // interval = 3;

        // d = Integer.parseInt(date.substring(0, 4));
        // System.out.println(d + 1);

    }

}
