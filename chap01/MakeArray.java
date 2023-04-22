package chap01;

import java.util.Arrays;

public class MakeArray {
    public static void main(String[] args) {

        int array[][] = {{0, 0, 0, 0, 6},
                        {0, 0, 0, 5, 6},
                        {0, 0, 4, 5, 6},
                        {0, 3, 4, 5, 6},
                        {2, 3, 4, 5, 6}};

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
