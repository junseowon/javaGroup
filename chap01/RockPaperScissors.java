package chap01;

import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int user;
        int cum;

        while(true) {
            System.out.println("[가위(1), 바위(2), 보(3), 종료(0)]");

            System.out.print("숫자를 입력하세요 : ");
            user = sc.nextInt();
            if((user > 3) || (user < 0))
            {
                continue;
            }
            else if(user == 0)
            {
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            else
            {
                cum = (int) (Math.random() * 3) + 1;
                System.out.println("컴퓨터 : " + cum);

                System.out.print("결과 : ");
                switch (user - cum) {
                    case -2, 1 -> System.out.println("승");
                    case -1, 2 -> System.out.println("패");
                    case 0 -> System.out.println("비김");
                }
            }
        }
    }
}
