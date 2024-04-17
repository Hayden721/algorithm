package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11659 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine()); // 예제 첫번째 줄을 읽어 온다.

    int suNo = Integer.parseInt(st.nextToken()); // int형으로 형 변환
    int quizNo = Integer.parseInt(st.nextToken()); // int형으로 형 변환

    long[] S = new long[suNo + 1]; // 배열이 0부터 시작이기 때문에 + 1을 해서 1번째부터로 계산할 수 있게 한다.

    st = new StringTokenizer(br.readLine());
    for(int i = 1; i <= suNo; i++) {
      S[i] = S[i - 1] + Integer.parseInt(st.nextToken()); // 합 배열
    }

    for(int j = 0; j < quizNo; j++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      System.out.println(S[k] - S[i-1]);
    }
  }
}
