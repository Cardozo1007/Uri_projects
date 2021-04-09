import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double div = 2 * a;
		
		if(delta < 0 || div == 0) {
			
			bw.write("Impossivel calcular\n");
		} else {
			
			double r1 = (-b + Math.sqrt(delta)) / div;
			double r2 = (-b - Math.sqrt(delta)) / div;
			bw.write("R1 = " + df.format(r1) + "\n");
			bw.write("R2 = " + df.format(r2) + "\n");
		}
		
		bw.flush();
	}

}