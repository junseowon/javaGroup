package chap01;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) throws Exception{

        for(int i = 0; i < 5; i++)
        {
            for(int j = 1; j < 5 - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 0; k < i * 2 + 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
