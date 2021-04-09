
import java.util.Locale;
import java.util.Scanner;
public class CoordenadasDeUmPonto {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if(y == 0) {
			System.out.println("Eixo X");
		}
		else if(x == 0) {
			System.out.println("Eixo Y");
		}
		else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}

	}

}
