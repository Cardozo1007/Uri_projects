import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class Media2 {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double a;
		double b;
		double c;
		
		a = Double.parseDouble((bf.readLine()).trim());
		b = Double.parseDouble((bf.readLine()).trim());
		c = Double.parseDouble((bf.readLine()).trim());
			
		double MEDIA = ((a * 2) + (b * 3) + (c * 5)) / 10;
		System.out.printf("MEDIA = %.1f\n", MEDIA);
		bw.flush();
	}

}
