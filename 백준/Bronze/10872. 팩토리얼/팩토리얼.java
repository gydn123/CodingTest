import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int num = Integer.parseInt(n);

        int answer = calc(num);

        System.out.println(answer);
    }
    
    public static int calc(int n) {
        int factorial = 1;

        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }

        return factorial;
    }

}