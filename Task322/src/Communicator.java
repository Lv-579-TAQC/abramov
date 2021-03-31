import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Communicator {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void resultOut(int message) {
        System.out.print(message);
    }

    public int readInputNumber() {
        int n = 0;
        do {
            System.out.println("Please enter number: ");
            try {
                n = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Entered not a number: ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (n <= 0);
        return n;
    }

    public void closeScanner() {
        //br.close();
    }

    public void getText(String s) {
        {
            System.out.print(s);
        }
    }
}
