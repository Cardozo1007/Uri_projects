import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Diferenca {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int a = Integer.parseInt(bf.readLine().trim());
		int b = Integer.parseInt(bf.readLine().trim());
		int c = Integer.parseInt(bf.readLine().trim());
		int d = Integer.parseInt(bf.readLine().trim());
		
		int df = (a * b - c * d);
		bw.write("DIFERENCA = " + df + "\n");
		bw.flush();

	}

}
