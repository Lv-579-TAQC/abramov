
public class Calc {
    public static int numberWithMaxSumOfDividers(int n) throws CalcExeption {
        if (n <= 0) {
            throw new CalcExeption("n < 0");
        }
        {
            int sum = 0;

            int maxSum = 0;

            int numWithMaxSum = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) sum += j;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    numWithMaxSum = i;
                }
                sum = 0;
            }

            return numWithMaxSum;
        }

    }
}