package chap01;


public class MakeArray {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for(int i = 4; i >= 0; i--) {
            for(int j = 4; j > i - 1; j--) {
                array[i][j] = j + 2;
            }
        }

        for(int i = 4; i >= 0; i--){
            System.out.print("[");
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j]);

                if (j < array.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
