import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mes {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine().trim());
		switch (a) {
		case 1:
			bw.write("January\n");
			break;
		case 2:
			bw.write("February\n");
			break;
		case 3:
			bw.write("March\n");
			break;
		case 4:
			bw.write("April\n");
			break;
		case 5:
			bw.write("May\n");
			break;
		case 6:
			bw.write("June\n");
			break;
		case 7:
			bw.write("July\n");
			break;
		case 8:
			bw.write("August\n");
			break;
		case 9:
			bw.write("September\n");
			break;
		case 10:
			bw.write("October\n");
			break;
		case 11:
			bw.write("November\n");
			break;
		case 12:
			bw.write("December\n");
			break;

		default:
			break;
		}
		
		bw.flush();

	}

}
