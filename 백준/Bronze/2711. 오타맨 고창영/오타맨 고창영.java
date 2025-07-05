import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스의 개수 T를 입력받습니다.
        int T = sc.nextInt();

        // 2. T번 만큼 반복합니다.
        for (int i = 0; i < T; i++) {
            // 3. 오타 위치(num)와 문자열(spell)을 입력받습니다.
            // nextInt() 다음에 next()를 쓰면 엔터키 문제를 신경쓰지 않아도 됩니다.
            int num = sc.nextInt();
            String spell = sc.next();

            // 4. StringBuilder로 문자열을 수정합니다.
            // 문제에서 위치는 1부터 시작하므로, 인덱스는 num - 1이 됩니다.
            StringBuilder sb = new StringBuilder(spell);
            sb.deleteCharAt(num - 1);

            // 5. 요구사항에 맞게 결과만 출력합니다.
            System.out.println(sb.toString());
        }

        sc.close();
    }
}