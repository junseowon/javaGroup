package chap01;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("피라미드 층을 입력하세요 : ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++)
        {
            for(int j = 1; j < num - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 0; k < i * 2 + 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
