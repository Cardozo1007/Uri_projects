import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SeisNumerosImpares {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> array = new ArrayList<Integer>();

		int n = Integer.parseInt(br.readLine().trim());
		
		while(array.size() < 6) {
			if(n % 2 != 0) {
				array.add(n);
			}
			n++;
		}
		
		Collections.sort(array);
		
		for(int i = 0; i < array.size(); i++) {
			bw.write(array.get(i) + "\n");
		}
		bw.flush();

	}

}