import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediasPonderadas {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		int intQt = sc.nextInt();
		double doubleNote[][] = new double[intQt][3], doubleResult[] = new double[intQt];
		
		for(int i = 0; i < intQt; i++) {
			for(int j = 0; j < 3; j++) {
				doubleNote[i][j] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i < intQt; i++) {
			doubleResult[i] = ((doubleNote[i][0] * 2) + (doubleNote[i][1] * 3) + (doubleNote[i][2] * 5)) / 10;
			System.out.println(df.format(doubleResult[i]));
		}
		
	}

}