package chap03;

public class Main {
    public static void main(String[] args) {
        String[] userNames = {"아이언맨", "타노스", "상도"};
        int[] userAges = {10, 8, 9};

        for (int i = 0; i < userNames.length; i++) {
            UserInfo userInfo = new UserInfo.Builder()
                    .name(userNames[i])
                    .age(userAges[i])
                    .build();

                    System.out.print(userInfo.toString());
        }
    }
}