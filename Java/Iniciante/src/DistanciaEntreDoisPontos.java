import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		bw.write(df.format(distancia)+ "\n");
		bw.flush();

	}

}
