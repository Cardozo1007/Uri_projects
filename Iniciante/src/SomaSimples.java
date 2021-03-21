import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SomaSimples {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int soma;
		a = Integer.parseInt(bf.readLine());
		b = Integer.parseInt(bf.readLine());
		soma = a + b;
		System.out.println("SOMA = " + soma);
	}

}
