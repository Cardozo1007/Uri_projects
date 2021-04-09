import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Animal {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine().trim();
		String b = br.readLine().trim();
		String c = br.readLine().trim();
		String animal = null;
		
		if(a.equals("vertebrado")) {
			if(b.equals("ave")) {
				if(c.equals("carnivoro")) {
					animal = "aguia";
				}
				else if(c.equals("onivoro")){
					animal = "pomba";
				}
			}
			else if(b.equals("mamifero")){
				if(c.equals("onivoro")) {
					animal = "homem";
				}
				else if(c.equals("herbivoro")){
					animal = "vaca";
				}
			}
		}
		else if(a.equals("invertebrado")){
			if(b.equals("inseto")) {
				if(c.equals("hematofago")) {
					animal = "pulga";
				}
				else if(c.equals("herbivoro")){
					animal = "lagarta";
				}
			}
			else if(b.equals("anelideo")){
				if(c.equals("hematofago")) {
					animal = "sanguessuga";
				}
				else if(c.equals("onivoro")) {
					animal = "minhoca";
				}
			}
		}
		
		bw.write(animal + "\n");
		bw.flush();

	}

}
