import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TesteDeSelecao1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if((b > c) && (d > a) && (c + d > a + b) &&
				(c > 0) && (d > 0) && (a % 2 == 0)) {
						bw.write("Valores aceitos\n");
		} else {
			bw.write("Valores nao aceitos\n");
		}
		
		bw.flush();

	}

}
