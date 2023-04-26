package chap01;

import java.util.Scanner;

public class AddOneHundred {
    public static void main(String[] args) throws Exception{
        getValue();
    }

    static int addValue(int x) {
        if(x > 0) {
            x += addValue(x - 1);
        }
        return x;
    }

    static void addPrintValue(int x) {
        System.out.println(addValue(x));
        getValue();
    }

    static void comparisonValue(int x)
    {
        if(x > 100) {
            System.out.println("큰 값을 입력했습니다.");
            getValue();
        } else if(x == 0) {
            System.out.print("종료합니다.");
        } else {
            addPrintValue(x);
        }
    }

    static void getValue() {
        Scanner sc = new Scanner(System.in);

        System.out.print("100이하의 정수를 입력해주세요 : ");
        int value = sc.nextInt();
        comparisonValue(value);
    }
}
