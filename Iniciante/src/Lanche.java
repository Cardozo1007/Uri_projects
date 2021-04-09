import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.00");
		
		int lanche = sc.nextInt();
		int qtde = sc.nextInt();
		double valor;
		String total = "Total: R$ ";
		
		switch (lanche) {
		case 1:
			valor = 4 * qtde;
			total += df.format(valor);
			break;
		case 2:
			valor = 4.50 * qtde;
			total += df.format(valor);
			break;
		case 3:
			valor = 5 * qtde;
			total += df.format(valor);
			break;
		case 4:
			valor = 2 * qtde;
			total += df.format(valor);
			break;
		case 5:
			valor = 1.50 * qtde;
			total += df.format(valor);
			break;

		default:
			break;
		}
		
		bw.write(total + "\n");
		bw.flush();

	}

}
