import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Tabuada {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, r;
		String resposta;
		n = Integer.parseInt(br.readLine().trim());
		for(int i = 1; i < 11; i++) {
			r = i * n;
			resposta = i + " x " + n + " = " + r + "\n";
			bw.write(resposta);
			bw.flush();
		}

	}

}
