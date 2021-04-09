import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ParesEntreCincoNumeros {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int pares = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			if(n % 2 == 0){
				pares++;
			}
		}
		
		bw.write(pares + " valores pares\n");
		bw.flush();

	}

}