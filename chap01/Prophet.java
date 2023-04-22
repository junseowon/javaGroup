package chap01;

import java.util.Scanner;
import java.util.Random;

public class Prophet {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int getNum = 0;
        int num = 0;
        int cum = 0;

        cum = random.nextInt(5) + 1;

        System.out.println("컴퓨터는 1 ~ 5사이에 수를 생각합니다! " + cum + "생각 중...");

        while(true)
        {
            num++;
            System.out.print("컴퓨터가 생각하는 수를 입력하세요 : ");
            getNum = sc.nextInt();
            if(getNum == cum)
            {
                System.out.print("축하합니다 " + num + "번만에 맞췄습니다.");
                break;
            }

            if((getNum > 5) || (getNum < 1))
            {
                System.out.println("컴퓨터는 1 ~ 5사이에 수를 생각합니다!");
                continue;
            }
        }
    }
}
