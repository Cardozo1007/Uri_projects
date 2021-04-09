import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if(a > b) {
			while(a <= 23 + b) {
				a++;
				c++;
			}
		}
		else if(a < b) {
			c = b - a;
		}
		else if(a == b) {
			c = 24;
		}
		
		bw.write("O JOGO DUROU " + c + " HORA(S)\n");
		bw.flush();

	}

}
