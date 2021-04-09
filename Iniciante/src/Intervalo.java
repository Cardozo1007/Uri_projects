import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Intervalo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		float a = Float.parseFloat(br.readLine().trim());
		String result = "Intervalo ";
		
		if(a >= 0 && a <= 25) {
			result += "[0,25]";
		}
		else if(a > 25 && a <= 50) {
			result += "(25,50]";
		}
		else if(a > 50 && a <= 75) {
			result += "(50,75]";
		}
		else if(a > 75 && a <= 100) {
			result += "(75,100]";
		}
		else {
			result = "Fora de intervalo";
		}
		result += "\n";
		bw.write(result);
		bw.flush();

	}

}
