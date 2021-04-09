import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class OMaior {

	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int maiorAB = (a + b + Math.abs(a - b)) / 2;
		int maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		bw.write(maiorBC + " eh o maior" + "\n");
		bw.flush();

	}

}
