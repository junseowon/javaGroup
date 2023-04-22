package chap01;

import java.util.Vector;

public class NoSpaces {
    public static void main(String[] args) {
        NoSpaces noSpaces = new NoSpaces();
        noSpaces.concat("학교종이", "땡땡땡");
        noSpaces.concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "롬복");
    }

    void concat(String...text){
        for (String i: text){
            System.out.print(i);
        }
        System.out.println();
    }
}
