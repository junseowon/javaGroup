package chap01;

public class MultiplicationTable {
    public static void main(String[] args) {

        int array[][] = new int[10][10];

        for(int i = 2; i <= 9; i++)
        {
            for(int j = 1; j <= 9; j++)
            {
                array[i - 2][j - 1] = i * j;
                System.out.print(array[i - 2][j - 1] + "\t");
            }
            System.out.println();
        }
    }
}
