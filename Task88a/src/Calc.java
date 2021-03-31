
public class Calc {

    public static String is3ExistInNumber(int n) throws CalcExeption {
        if (n <= 0) {
            throw new CalcExeption("n < 0");
        }
        n = n * n;
        while (n > 0) {
            if (n % 10 == 3) {
                return "There is 3 in n^2";
            }
            n = n / 10;
        }
        return "There isn't 3 in n^2";
    }
}
