import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;

public class AumentoDeSalario {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.00");
		
		float s = Float.parseFloat(br.readLine().trim());
		int p = 0;
		
		if(s > 0 && s <= 400)
			p = 15;
		else if(s > 400 && s <= 800)
			p = 12;
		else if(s > 800 && s <= 1200)
			p = 10;
		else if(s > 1200 && s <= 2000)
			p = 7;
		else if(s > 2000)
			p = 4;
		
		double rg = (s / 100) * p;
		
		s += rg;
		
		bw.write("Novo salario: " + df.format(s) + "\n");
		bw.write("Reajuste ganho: " + df.format(rg) + "\n");
		bw.write("Em percentual: " + p + " %\n");
		bw.flush();

	}

}
