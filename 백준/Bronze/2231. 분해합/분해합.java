import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0; // 생성자를 저장할 변수, 찾지 못하면 0이 그대로 출력됨

        // 1부터 N까지 모든 수를 검사 (i가 생성자 후보)
        for (int i = 0; i < N; i++) {
            int number = i; // 현재 후보 숫자
            int sum = number; // 분해합 계산을 위해 초기값을 후보 숫자로 설정

            // 현재 후보 숫자의 각 자리수를 더하는 과정
            while (number > 0) {
                sum += number % 10; // 10으로 나눈 나머지는 가장 끝 자리수
                number /= 10;       // 10으로 나눈 몫은 끝 자리수를 제외한 나머지 숫자
            }

            // 계산된 분해합(sum)이 입력값(N)과 같다면
            if (sum == N) {
                result = i; // 현재 후보(i)가 N의 가장 작은 생성자임
                break;      // 가장 작은 생성자를 찾았으므로 더 이상 반복할 필요 없음
            }
        }
        // 결과 출력
        System.out.println(result);

    }
}