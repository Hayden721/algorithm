package BackJoon;

import java.util.Scanner;

public class No11720 {
  public static void main(String[] args) {
    
    try (// 스캐너 사용
    Scanner sc = new Scanner(System.in)) {
      // 입력 받기
      int N = sc.nextInt();
      
      String sNum = sc.next();
      
      char[] cNum = sNum.toCharArray();
      int sum = 0;

      for(int i = 0; i<cNum.length; i++) {
        sum += cNum[i] - '0'; // char 형태를 int형으로 바꾸기 위해 아스키 코드로 뺴준다.
      }

      System.out.println("합 : " + sum );
    }
    
  }
}
