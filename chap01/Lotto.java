package chap01;

public class Lotto {
    public static void main(String[] args){

        int array[] = new int[6];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                while (array[j] == array[i]) {
                    array[i] = (int)(Math.random() * 45) + 1;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}

