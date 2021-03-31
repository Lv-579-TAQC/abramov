

public class Calc {
    public static int reverseInputNumber(int n) throws CalcExeption {
        if (n <= 0) {
            throw new CalcExeption("n < 0");
        }
        {
            int temp = 0;
            while (n > 0) {
                temp = temp * 10 + n % 10;
                n = n / 10;
            }
            return temp;
        }

   /* public int reverseInputNumber1(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        return Integer.parseInt(sb.reverse().toString());
    }
*/

    }
}