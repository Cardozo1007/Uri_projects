import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class SomaDeImparesConsecutivos1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine().trim());
		int b = Integer.parseInt(br.readLine().trim());
		int r = 0;
		
		if(a < b) {
			while(a < b) {
				a++;
				if(a % 2 != 0 && a != b) {
					r += a;
				}
			}
		}
		else if(a > b) {
			while(b < a) {
				b++;
				if(b % 2 != 0 && a != b) {
					r += b;
				}
			}
		}
		
		bw.write(r + "\n");
		bw.flush();

	}

}