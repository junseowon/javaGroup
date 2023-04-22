package chap02;

public class FriendsInfo {
    private String name;
    private int age;
    private String phoneNumber;

    public FriendsInfo() {
    }

    public FriendsInfo(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Friend(" + "name=" + name + ", age=" + age + ", phone=" + phoneNumber + ")";
    }
}
