package chap01;

public class NoSpaces {
    public static void main(String[] args) {
        concat("학교종이", "땡땡땡");
        concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "롬복");
    }

    static void concat(String...text){
        for (String i: text){
            System.out.print(i);
        }
        System.out.println();
    }
}
