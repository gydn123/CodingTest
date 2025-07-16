import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        List<Integer> list = solve(input);

        list.sort(Collections.reverseOrder());

        for (int a : list) {
            System.out.print(a);
        }
    }
    public static List<Integer> solve(String n) {
        List<Integer> list = new ArrayList<>();
        for (char c : n.toCharArray()) {
            list.add(c - '0');
        }
        return list;
    }

}