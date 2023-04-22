package chap01;

import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        int array[] = new int[num];

        for(int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
}
