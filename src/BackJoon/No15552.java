package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No15552 {
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    
    int t = Integer.parseInt(br.readLine());


    for(int i = 0; i < t; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      

      int result = x + y;

      bw.write(result + "\n");
    }

    
    br.close();
    bw.flush();
    bw.close();


  }


}
