import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class Media1 {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double a;
		double b;
		do {
			a = Double.parseDouble((bf.readLine()).trim());
			b = Double.parseDouble((bf.readLine()).trim());
		}while(a > 10.0 || b > 10 || a < 0 || b < 0);
		double MEDIA = ((a * 3.5) + (b * 7.5)) / 11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		bw.flush();
	}

}
