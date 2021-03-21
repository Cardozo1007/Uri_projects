import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class AreaDoCirculo {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.0000");
		double area;
		double n = 3.14159;
		double raio;
		raio = Double.parseDouble(bf.readLine());
		area = n * Math.pow(raio, 2);
		System.out.println("A=" + df.format(area));

	}

}
