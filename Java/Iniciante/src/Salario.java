import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;

public class Salario {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.00");
		
		int numero = Integer.parseInt((bf.readLine()).trim());
		int horas = Integer.parseInt((bf.readLine()).trim());
		double valor = Double.parseDouble((bf.readLine()).trim());
			
		double salario = horas * valor;
		
		bw.write("NUMBER = " + numero + "\n");
		bw.write("SALARY = U$ " + df.format(salario) + "\n");
		bw.flush();
	}

}
