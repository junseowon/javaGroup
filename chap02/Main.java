package chap02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FriendsInfo[] friendsArray = new FriendsInfo[5];
        Scanner sc = new Scanner(System.in);
        //== 친구들 신상 초기화 ==
        String[] name = {"신짱구", "김철수", "맹구", "이유리", "이훈이"};
        int[] age = {5, 5, 5, 5, 5};
        String[] phoneNumber = {"010-1111-1111", "010-2222-2222", "010-3333-3333",
                "010-4444-4444", "010-5555-5555"};
        //== 친구들 신상 초기화 ==

        //== 친구들 신상 정보 담기 ==
        for (int i = 0; i < friendsArray.length; i++) {
            friendsArray[i] = new FriendsInfo(name[i], age[i], phoneNumber[i]);
        }
        //== 친구들 신상 정보 담기 ==

        //== 친구들 이름만 출력 ==
        System.out.println("== List ==");
        for (FriendsInfo friendsInfo : friendsArray) {
            System.out.println(friendsInfo.getName());
        }
        System.out.println();
        //== 친구들 이름만 출력 ==

        while(true)
        {
            //== 친구 이름 입력 ==
            System.out.print("신상을 알고싶은 사람의 이름을 입력해주세요 : ");
            String inputName = sc.nextLine();
            //== 친구 이름 입력 ==

            if(inputName.equals("0"))
            {
                System.out.println("종료합니다.");
                break;
            }

            for (FriendsInfo friendsInfo : friendsArray) {
                if (inputName.equals(friendsInfo.getName())) {
                    System.out.println(friendsInfo.toString());
                    System.out.println();
                    break;
                }
            }
        }
    }
}
