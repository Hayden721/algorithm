public class IfSwitchWhlie {
  public static void main(String[] args) {

    int funcCheck = if1(10);  
    System.out.println(funcCheck);
  }

  public static int if1(int i) {

    int result = 0;
  
    for(int i = 1; i <=20; i++) {
      if(!(i % 2 == 0 || i % 3 == 0)) {
        result += i;
      }
      
    }
    return result;
  }
  
}

