import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ParesImparesPositivosENegativos {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			if(n % 2 == 0)
				pares++;
			else if(n % 2 != 0)
				impares++;
			
			if(n > 0)
				positivos++;
			else if(n < 0)
				negativos++;
		}
		
		bw.write(pares + " valor(es) par(es)\n");
		bw.write(impares + " valor(es) impar(es)\n");
		bw.write(positivos + " valor(es) positivo(s)\n");
		bw.write(negativos + " valor(es) negativo(s)\n");
		bw.flush();

	}

}
