package chap01;

public class Suffle {
    public static void main(String[] args) {
        int[] array = new int[45];
        int tmp;

        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        for (int j = 0; j < 6; j++){
            int n = (int)(Math.random() * 45);
            tmp = array[j];
            array[j] = array[n];
            array[n] = tmp;
        }

        for (int e : array) {
            System.out.println(e);
        }
    }
}
