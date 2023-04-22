package chap01;

import java.util.Scanner;

public class AddOneHundred {
    public static void main(String[] args) throws Exception{
        AddOneHundred io = new AddOneHundred();

        io.getValue();
    }

    int addValue(int x)
    {
        AddOneHundred io = new AddOneHundred();
        if(x > 0)
        {
            x += io.addValue(x - 1);
        }
        return x;
    }

    void addPrintValue(int x)
    {
        AddOneHundred io = new AddOneHundred();

        System.out.println(io.addValue(x));
        io.getValue();
    }

    void comparisonValue(int x)
    {
        AddOneHundred io = new AddOneHundred();

        if(x > 100)
        {
            System.out.println("큰 값을 입력했습니다.");
            io.getValue();
        }
        else if(x == 0)
        {
            System.out.print("종료합니다.");
        }
        else
        {
            io.addPrintValue(x);
        }
    }

    void getValue()
    {
        AddOneHundred io = new AddOneHundred();
        Scanner sc = new Scanner(System.in);

        System.out.print("100이하의 정수를 입력해주세요 : ");
        int value = sc.nextInt();
        io.comparisonValue(value);
    }
}
