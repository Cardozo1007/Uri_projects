import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConversaoDeTempo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int h = 0;
		int m = 0;
		int s = 0;
		
		s = Integer.parseInt(br.readLine().trim());
		
		while(s >= 3600) {
			s -= 3600;
			h++;
		}
		
		while(s >= 60) {
			s -= 60;
			m++;
		}
		
		bw.write(h + ":" + m + ":" + s + "\n");
		bw.flush();

	}

}
