import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.000");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double triangulo = a * c / 2;
		double pi = 3.14159;
		double circulo = pi * Math.pow(c, 2);
		double trapezio = ((a + b) / 2) * c;
		double quadrado = Math.pow(b, 2);
		double retangulo = a * b;
		
		bw.write("TRIANGULO: " + df.format(triangulo) + "\n");
		bw.write("CIRCULO: " + df.format(circulo) + "\n");
		bw.write("TRAPEZIO: " + df.format(trapezio) + "\n");
		bw.write("QUADRADO: " + df.format(quadrado) + "\n");
		bw.write("RETANGULO: " + df.format(retangulo) + "\n");
		bw.flush();

	}

}