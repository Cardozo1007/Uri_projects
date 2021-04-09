import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Media3 {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("0.0");
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		String aluno = "Aluno ";
		String media = "Media: ";
			
		double m = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;
		if(m >= 7) {
			media += df.format(m);
			aluno += "aprovado.";
		}
		else if(m < 5) {
			media += df.format(m);
			aluno += "reprovado.";
		}
		else if(m >= 5 && m < 7) {
			media += df.format(m);
			aluno += "em exame.";
		}
		bw.write(media + "\n");
		bw.write(aluno + "\n");
		
		if(m >= 5 && m < 7) {
			float exame =  sc.nextFloat();
			bw.write("Nota do exame: " + df.format(exame) + "\n");
			m = (exame + m) / 2;
			if(m >= 5) {
				aluno = "Aluno aprovado.";
			}
			else {
				aluno = "Aluno reprovado.";
			}
			bw.write(aluno + "\n");
			bw.write("Media final: " + df.format(m) + "\n");
		}
		
		bw.flush();
	}
}