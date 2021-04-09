import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double r = b % a;
		double r2 = a % b;
		
		if(r == 0 || r2 == 0) {
			bw.write("Sao Multiplos\n");
		}
		else {
			bw.write("Nao sao Multiplos\n");
		}
		bw.flush();

	}

}
