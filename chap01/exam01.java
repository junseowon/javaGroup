package chap01;

import java.util.Scanner;

public class exam01 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("두 개의 수를 띄어쓰기하여 입력해주세요 : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("입력한 값 중 큰 수는 " + ((x == y) ? 0 : (x > y) ? x : y) + "입니다.");
    }
}
