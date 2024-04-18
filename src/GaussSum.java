public class GaussSum {
  public static void main(String[] args) {
    System.out.println(sumof(3, 6));


    // System.out.println(gauss(1, 5));
  }

  static int gauss(int a, int b) {
    int sum = 0;

    if(a + b % 2 == 0 ) {
      
    }

    return sum = (a + b) * (a + b) / 2;
  }

  static int sumof(int a, int b) {
    int sum = 0;
    System.out.println(sum);
    for (int i = a; i <= b; i++) {

      sum += i;
      System.out.println(sum);
    }
    
    return sum;
  }
}
