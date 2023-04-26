package chap01;

public class MultiplicationTable {
    public static void main(String[] args) {

        int array[][] = new int[9][9];

        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                array[i - 2][j - 1] = i * j;
            }
        }

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
