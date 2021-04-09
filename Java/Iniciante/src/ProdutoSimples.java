import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ProdutoSimples {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(bf.readLine().trim());
		int b = Integer.parseInt(bf.readLine().trim());
		bw.write("PROD = " + (a * b) + "\n");
		bw.flush();

	}

}
