import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class NumerosPares {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 2; i <= 100; i++) {
			bw.write(i + "\n");
			bw.flush();
			i++;
		}
	}
}