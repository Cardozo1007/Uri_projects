import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.00");
			int id1 = in.nextInt();
			int qtde1 = in.nextInt();
			double preco1 = in.nextDouble();
			int id2 = in.nextInt();
			int qtde2 = in.nextInt();
			double preco2 = in.nextDouble();
			
			double valor1 = qtde1 * preco1;
			double valor2 = qtde2 * preco2;
			
			double valorTotal = valor1 + valor2;
			
			bw.write("VALOR A PAGAR: R$ " + df.format(valorTotal) + "\n");
			bw.flush();

	}

}
