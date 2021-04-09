import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a[] = new int[3];
		ArrayList <Integer> b = new ArrayList<Integer>();
		
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
			b.add(a[i]);
		}
		
		Collections.sort(b);
		
		for(int i = 0; i < 3; i++) {
			bw.write(b.get(i) + "\n");
			bw.flush();
		}
		System.out.println("");
		for(int i = 0; i < 3; i++) {
			bw.write(a[i] + "\n");
			bw.flush();
		}
		
	}

}