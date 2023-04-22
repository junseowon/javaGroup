package chap01;

public class PrimeNumber {
    public static void main(String[] args) {
        int remainder = 0;
        for(int i = 2; i <= 100; i++)
        {
            for(int j = 2; j <= i; j++)
            {
                if(i % j == 0)
                {
                    remainder++;
                }
            }
            if(remainder == 1)
            {
                System.out.print(i + " ");
            }
            remainder = 0;
        }
    }
}
