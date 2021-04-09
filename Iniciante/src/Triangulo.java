import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.0");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a < b + c && b < a + c && c < a + b) {
			double per = a + b + c;
			bw.write("Perimetro = " + df.format(per) + "\n");
		}
		else {
			double area = ((a + b) * c) / 2;
			bw.write("Area = " + df.format(area) + "\n");
		}
		bw.flush();

	}

}