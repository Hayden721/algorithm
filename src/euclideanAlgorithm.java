public class euclideanAlgorithm {
  public static void main(String[] args) {
    
    int result = gcd(10, 8);
    int result2 = gcd2(10, 8);
  

    System.out.println(result);
    System.out.println(result2);
    
    
  }


  //2
  public static int gcd2(int a, int b) {
    while(b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
}
