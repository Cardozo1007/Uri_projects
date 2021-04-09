import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Resto2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		n = Integer.parseInt(br.readLine().trim());
		
		for(int i = 0; i < 10000; i++) {
			if(i % n == 2) {
				bw.write(i + "\n");
				bw.flush();
			}
		}
	}

}