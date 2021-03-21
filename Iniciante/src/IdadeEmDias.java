import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IdadeEmDias {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = 0;
		int m = 0;
		int d = 0;
		
		d = Integer.parseInt(br.readLine().trim());
		
		while(d >= 365) {
			d -= 365;
			a++;
		}
		
		while(d >= 30) {
			d -= 30;
			m++;
		}
		
		bw.write(a + " ano(s)\n");
		bw.write(m + " mes(es)\n");
		bw.write(d + " dia(s)\n");
		bw.flush();

	}

}
