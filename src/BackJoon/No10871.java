package BackJoon;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No10871 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine(), " ");
    

    for(int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    // x 보다 작은 수 출력
    for(int i = 0; i< arr.length; i++) {
      if(arr[i]< x) {
        bw.write(arr[i] + " ");
        
      }
    }
    

    br.close();
    bw.flush();    
    bw.close();
    
  }
}
