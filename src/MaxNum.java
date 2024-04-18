public class MaxNum {
  public static void main(String[] args) {
    
    
    System.out.println("4개 중 최대값 찾기 : " + max4(1,2,3,4));
    System.out.println("3개 중 최소값 찾기 : " + min(1,2,3));
    System.out.println("4개 중 최소값 찾기 : " + min4(1,2,3,4));
  }

  static int max4(int a, int b, int c, int d) {
    int max = a;

    if(b > max) 
      max = b;
    if(c > max)
      max = c;
    if(d > max)
      max = d;
    
      return max;
  }

  static int min(int a, int b, int c) {
    
    int min = a;

    if(b < min)
      min = b;
    if(c < min)
      min = c;

    return min;
  }

  static int min4(int a, int b, int c, int d) {

    int min = a;

    if(b < min) {
      min = b;
    }
    if(c < min) {
      min = c;
    }
    if(d < min) {
      min = d;
    }


    return min;
  }
}
