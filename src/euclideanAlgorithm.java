public class euclideanAlgorithm {
  public static void main(String[] args) {
    
    
    int result2 = gcd2(10, 8);
  

    
    System.out.println(result2);
    
    
  }

  // 유클리드 호재법
  public static int gcd2(int a, int b) {
    while(b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
}
