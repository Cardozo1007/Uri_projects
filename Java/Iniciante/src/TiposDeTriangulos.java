import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulos {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Double> array = new ArrayList<Double>();
		
		for(int i = 0; i < 3; i++) {
			double a = sc.nextDouble();
			array.add(a);
		}
		
		Collections.sort(array, Collections.reverseOrder());
		
		double a = array.get(0);
		double b = array.get(1);
		double c = array.get(2);
		
		if(a >= b + c) {
			bw.write("NAO FORMA TRIANGULO\n");
		} else {
			if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				bw.write("TRIANGULO RETANGULO\n");
			}
			else if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				bw.write("TRIANGULO OBTUSANGULO\n");
			}
			else if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
				bw.write("TRIANGULO ACUTANGULO\n");
			}
			if(a == b && b == c) {
				bw.write("TRIANGULO EQUILATERO\n");
			}
			else if(a == b || b == c || a == c) {
				bw.write("TRIANGULO ISOSCELES\n");
			}
		}
		bw.flush();
	
	}

}