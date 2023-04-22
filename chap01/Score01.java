package chap01;

import java.util.Scanner;

public class Score01 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("0~100 사이의 학점을 입력하세요 : ");
        int score = sc.nextInt();

        char result = (score > 90) ? 'A' :
                            ((score > 80) ? 'B' :
                                    ((score > 70) ? 'C' :
                                            ((score > 60) ? 'D' : 'F')));

        System.out.print("학점 (" + score + ")은 " + result + "입니다.");
    }
}
