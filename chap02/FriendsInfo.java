package chap02;

public class FriendsInfo {
    private final String name;
    private final int age;
    private final String phoneNumber;

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
