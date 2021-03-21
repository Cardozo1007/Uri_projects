import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;

public class Esfera {

	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.000");
		
		double r = Double.parseDouble(br.readLine().trim());
		double pi = 3.14159;
		double v = (4.0/3) * pi * Math.pow(r, 3);
		
		bw.write("VOLUME = " +df.format(v)+ "\n");
		bw.flush();
	}

}
