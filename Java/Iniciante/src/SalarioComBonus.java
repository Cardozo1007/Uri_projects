import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;

public class SalarioComBonus {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.00");
		
		String nome = bf.readLine().trim();
		double salariofixo = Double.parseDouble((bf.readLine()).trim());
		double comissao = Double.parseDouble((bf.readLine()).trim()) / 100 * 15;
			
		double total = salariofixo + comissao;
		
		bw.write("TOTAL = R$ " + df.format(total) + "\n");
		bw.flush();
	}

}