import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferTest {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    
    int test1 = Integer.parseInt(br.readLine());
    br.close();
    
    bw.write(Integer.toString(test1));
    bw.newLine();

  
    bw.flush();
    bw.close();
  }
}
