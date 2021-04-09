import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CartaDeNatalCriptografada {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		char caracteres[] = {'@', '&', '!', '*', '#'};
		
		String texto = "";
		ArrayList<String> text = new ArrayList<String>();
		
		do {
			texto = br.readLine();
			for(int i = 0; i < 5; i++) {
				texto = texto.replace(caracteres[i], vogais[i] );
			}
			text.add(texto);
		}while(br.ready());
		
		for(int i = 0; i < text.size(); i++) {
			bw.write(text.get(i) + "\n");
			bw.flush();
		}
		
		sc.close();

	}

}