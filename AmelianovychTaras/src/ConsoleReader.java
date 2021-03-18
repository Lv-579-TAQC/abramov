import java.io.BufferedReader;

public class ConsoleReader {
    private int i;
    public int readNaturalNumber(BufferedReader bf) {
        System.out.println("Please enter a natural number. It should be greater than 1");
        do {
            try {
                i = Integer.parseInt(bf.readLine());
            }catch (Exception e) {
                System.out.println("This should be a number");
            }
        }while (i <= 1);
        return i;
    }
}
