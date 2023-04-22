package chap03;

public final class MemberBuilder {
    private String name;
    private int age;

    private MemberBuilder(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static MemberBuilder aMember(String name, int age){
        return new MemberBuilder(name, age);
    }

    public MemberBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public MemberBuilder withAge(int age) {
        this.age = age;
        return this;
    }
}
