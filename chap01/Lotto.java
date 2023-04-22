package chap01;

import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        Random random = new Random();

        int array[] = new int[6];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                while (array[j] == array[i]) {
                    System.out.print("같음 : ");
                    array[i] = random.nextInt(45) + 1;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}

