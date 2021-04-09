import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Consumo {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.000");
		
		int x = Integer.parseInt(br.readLine().trim());
		double y = Double.parseDouble(br.readLine().trim());
		
		double z = x / y;
		
		bw.write(df.format(z) + " km/l" + "\n");
		bw.flush();

	}

}
