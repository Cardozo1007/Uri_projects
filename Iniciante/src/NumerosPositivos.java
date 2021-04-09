import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumerosPositivos {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double valor[] = new double[6];
		int n = 0;
		for(int i = 0; i < 6; i++) {
			valor[i] = Double.parseDouble(br.readLine().trim());
			if(valor[i] > 0) {
				n++;
			}
		}
		bw.write(n + " valores positivos\n");
		bw.flush();

	}

}
