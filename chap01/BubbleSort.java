package chap01;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
        }

        for (int i = 0; i < array.length - 1; i++){
            boolean changed = false;
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    changed = true;
                }
            }
            if (!changed){
                break;
            }
            for (int e : array) {
                System.out.print(e);
            }
            System.out.println();
        }
    }
}
