import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TempoDeUmEvento {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		@SuppressWarnings("unused")
		String a;
		a = sc.next();
		int dInicial = sc.nextInt();
		int hInicial = sc.nextInt();
		a = sc.next();
		int mInicial = sc.nextInt();
		a = sc.next();
		int sInicial = sc.nextInt();
		a = sc.next();
		int dFinal = sc.nextInt();
		int hFinal = sc.nextInt();
		a = sc.next();
		int mFinal = sc.nextInt();
		a = sc.next();
		int sFinal = sc.nextInt();
		
		int d = 0;
		int h = 0;
		int m = 0;
		int s = 0;
		
		if(dInicial < dFinal) {
			d = dFinal - dInicial;
		}
		
		if(hInicial < hFinal) {
			h = hFinal - hInicial;
		}
		else if(hInicial > hFinal) {
			while(hInicial <= 23 + hFinal) {
				h++;
				hInicial++;
			}
			if(mInicial < mFinal) {
				d--;
			}
			else if(mInicial > mFinal) {
				d--;
				h--;
			}
		}
		
		if(mInicial < mFinal) {
			m = mFinal - mInicial;
			if(sInicial > sFinal) {
				d--;
				m--;
			}
		}
		else if(mInicial > mFinal) {
			while(mInicial <= 59 + mFinal) {
				m++;
				mInicial++;
			}
			if(hInicial < hFinal) {
				h--;
			}
			else if(hInicial == hFinal) {
				d--;
				h = 23;
			}
		}
		
		if(sInicial < sFinal) {
			s = sFinal - sInicial;
		}
		else if(sInicial > sFinal) {
			while(sInicial <= 59 + sFinal) {
				s++;
				sInicial++;
			}
			if(mInicial == mFinal) {
				h--;
				m = 59;
			}
			else if(mInicial > mFinal) {
				m--;
				if(hInicial == hFinal) {
					d--;
					h = 23;
				}
			}
			else if(mInicial < mFinal) {
				if(hInicial == hFinal) {
					d++;
				}
			}
		}
		
		bw.write(d + " dia(s)\n");
		bw.write(h + " hora(s)\n");
		bw.write(m + " minuto(s)\n");
		bw.write(s + " segundo(s)\n");
		bw.flush();

	}

}
