import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ParOuImpar {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine().trim());
		String r = "";
		
		for(int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine().trim());
			if(b % 2 == 0 && b != 0)
				r += "EVEN";
			else if(b % 2 != 0)
				r += "ODD";
			
			if(b > 0)
				r += " POSITIVE";
			else if(b < 0)
				r += " NEGATIVE";
			
			if(b == 0)
				r = "NULL";
			
			bw.write(r + "\n");
			r = "";
		}
		
		bw.flush();
	}

}
