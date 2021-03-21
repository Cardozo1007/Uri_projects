import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExtremamenteBasico {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int x;
		a = Integer.parseInt(bf.readLine());
		b = Integer.parseInt(bf.readLine());
		x = a+b;
		System.out.println("X = "+x);

	}

}
