import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;

public class ImpostoDeRenda {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.00");
		
		float s = Float.parseFloat(br.readLine().trim());
		double imposto = 0;
		double resto;
		
		if(s <= 2000) {
			bw.write("Isento\n");
		}
		else {
			if(s > 4500) {
				imposto = 1000 * 0.08 + 1500 * 0.18;
				resto = s - 4500;
				imposto += resto * 0.28;
			}
			else if(s > 3000) {
				imposto = 1000 * 0.08;
				resto = s - 3000;
				imposto += resto * 0.18;
			}
			else if(s > 2000) {
				resto = s - 2000;
				imposto += resto * 0.08;
			}
			
			bw.write("R$ " + df.format(imposto) + "\n");
		}
		
		bw.flush();

	}

}