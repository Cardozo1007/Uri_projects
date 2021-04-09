import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Intervalo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int in = 0;
		int out = 0;
		
		int a = Integer.parseInt(br.readLine().trim());
		
		for(int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine().trim());
			if(b >= 10 && b <= 20)
				in++;
			else
				out++;
		}
		
		bw.write(in + " in\n");
		bw.write(out + " out\n");
		bw.flush();
	}

}