import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class Cedulas {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cem = 0;
		int cinquenta = 0;
		int vinte = 0;
		int dez = 0;
		int cinco = 0;
		int dois = 0;
		int um = 0;
		
		int n = Integer.parseInt(br.readLine().trim());
		bw.write(n + "\n");
		while(n >= 100) {
			n = n - 100;
			cem++;
		}
		
		while(n >= 50) {
			n = n - 50;
			cinquenta++;
		}
		
		while(n >= 20) {
			n = n - 20;
			vinte++;
		}
		
		while(n >= 10) {
			n = n - 10;
			dez++;
		} 
		
		while(n >= 5) {
			n = n - 5;
			cinco++;
		} 
		
		while(n >= 2) {
			n = n - 2;
			dois++;
		} 
		
		while(n >= 1) {
			n = n - 1;
			um++;
		}
		
		bw.write(cem + " nota(s) de R$ 100,00\n");
		bw.write(cinquenta + " nota(s) de R$ 50,00\n");
		bw.write(vinte + " nota(s) de R$ 20,00\n");
		bw.write(dez + " nota(s) de R$ 10,00\n");
		bw.write(cinco + " nota(s) de R$ 5,00\n");
		bw.write(dois + " nota(s) de R$ 2,00\n");
		bw.write(um + " nota(s) de R$ 1,00\n");
		bw.flush();
	}

}