package chap03;

public class UserInfo {
    private final String name;
    private final int age;

    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public UserInfo build() {
            return new UserInfo(this);
        }
    }

    public UserInfo(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "(" + "name=" + name + ", " + "age=" + age + ")";
    }
}
