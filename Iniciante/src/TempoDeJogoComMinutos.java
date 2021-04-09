import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TempoDeJogoComMinutos {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int h = 0;
		int m = 0;
		
		if(a > c) {
			while(a <= 23 + c) {
				a++;
				h++;
			}
			if(b > d) {
				h--;
			}
		}
		else if(a < c) {
			h = c - a;
			if(b > d) {
				h--;
			}
		}
		else if(a == c) {
			h = 24;
			if(b > d) {
				h--;
			}
			else if(b < d) {
				h = 0;
			}
		}
		
		if(b > d) {
			while(b <= 59 + d) {
				b++;
				m++;
			}
		}
		else if(b < d) {
			m = d - b;
		}
		
		bw.write("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)\n");
		bw.flush();

	}

}