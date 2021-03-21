import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;

public class GastoDeCombustivel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.000");
		
		double tempoGasto = Double.parseDouble(br.readLine().trim());
		double velocMedia = Double.parseDouble(br.readLine().trim());
		
		double r1 = velocMedia / 12;
		double result = tempoGasto * r1;
		bw.write(df.format(result) + "\n");
		bw.flush();

	}

}