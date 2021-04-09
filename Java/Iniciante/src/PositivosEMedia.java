import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

public class PositivosEMedia {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.0");
		ArrayList<Double> array = new ArrayList<Double>();
		
		int positivos = 0;
		double m = 0;
		
		for(int i = 0; i < 6; i++) {
			double n = Double.parseDouble(br.readLine().trim());
			if(n > 0){
				positivos++;
				array.add(n);
			}
		}
		
		for(int i = 0; i < array.size(); i++) {
			m += array.get(i);
		}
		
		m = m / array.size();
		
		bw.write(positivos + " valores positivos\n");
		bw.write(df.format(m) + "\n");
		bw.flush();

	}

}
